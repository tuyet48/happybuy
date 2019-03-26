happybuy.controller('CategoryProductCtrl', ['$scope','$http','AuthService','$routeParams',
function($scope, $http, authService, $routeParams){
	
	$scope.maxSize = 0;
	$scope.categoryId = $routeParams.categoryId;  
	$scope.pageList=[];
	$scope.getProdByCate = function(pageNumber){
		console.log("pageNumber: ", pageNumber);		
		var request = {        
			"data": $scope.categoryId,
			"metadata": {
				"pageNumber": pageNumber,
				"pageSize": 9         
				}            
			}	
			console.log("request: ", request);			
		$http({
			url: "/rest/no-auth/product/find-by-category",
			method: "POST",
			data: request,
			headers: authService.createAuthorizationTokenHeader()
		})
		.then(function(res) {
			$scope.products = res.data;
			console.log($scope.products);
		})
		.catch(function(response) {
			alert("Server is error, please try again!")
		});	
	}
	$scope.getProdByCate(1);

	$scope.getNumberOfPages = function () {
		$http({
			url: "/rest/no-auth/product/count-pages",
			method: "GET",
			params: {
				categoryId: $scope.categoryId,
				itemPerPage: 9
			}
		})
		.then(function(res){
			var totalPage = res.data;			
			$scope.maxSize = res.data;
			if (totalPage > 5){
				totalPage = 5;
			}		
			for (var i = 1; i<=totalPage; i++){
				$scope.pageList.push(i);
			}			
			console.log("getNumOfPage:", $scope.pageList);				
		})
		.catch(function(response){
			alert("Server is error, please try again")
		});
	}
	$scope.getNumberOfPages();	
	
	$scope.clickPage = function(index){			
		$scope.pageList = [];	
		var begin = index - 2;
		var end = index + 2;
		console.log("maxSize: ", $scope.maxSize);	
		if ($scope.maxSize > 5){
			if (begin <= 0){
				begin = 1;
				end = 5;
			}
			if (end >= $scope.maxSize){
				begin = $scope.maxSize - 4;
				end = $scope.maxSize;				
			}			
		}else{
			begin = 1;
			end = $scope.maxSize;		
		}			
		for (var i=begin; i<=end; i++){
			$scope.pageList.push(i);								
		}	
		$scope.getProdByCate(index);		
		console.log("clickPage: ", $scope.pageList);
	}		
	
}]);

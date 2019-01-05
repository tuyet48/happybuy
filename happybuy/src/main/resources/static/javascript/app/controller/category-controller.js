happybuy.controller('CategoryProductCtrl', ['$scope','$http','$window','$rootScope', 'AuthService', '$routeParams',
function($scope, $http, $window, $rootScope, authService, $routeParams){

	$scope.categoryId = $routeParams.categoryId;  
	$scope.getProdByCate = function(){
		var request = {        
			"data": $scope.categoryId,
			"metadata": {
				"pageNumber": 1,
				"pageSize": 15              
				}            
			}				
		$http({
			url: "/no-auth/product/find-by-category",
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
	$scope.getProdByCate();

	$scope.getNumberOfPages = function () {
		$http({
			url: "/no-auth/product/count-pages",
			method: "GET",
			params: {
				categoryId: $scope.categoryId,
				itemPerPage: 5
			}
		})
		.then(function(res){		
			$scope.pageList = $scope.getNumber(res.data);
			console.log($scope.pageList);
		})
		.catch(function(response){
			alert("Server is error, please try again")
		});
	}
	$scope.getNumberOfPages();

	$scope.getNumber = function(num) {
		return new Array(num);
	}
}]);

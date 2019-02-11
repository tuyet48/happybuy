happybuy.controller('ProductCtrl', ['$scope', '$routeParams', '$http',
     function($scope, $routeParams, $http){  

    $scope.productId = $routeParams.productId;
    $scope.getProdById = function(){
        $http({
			url: "/no-auth/product/find-id?id=" + $scope.productId,
			method: "GET"
		})
		.then(function(res){			
			$scope.product = res.data;		
			console.log("product: ", $scope.product);			
			$scope.sizeArray = $scope.product.size.split(',');
			$scope.colorArray = $scope.product.color.split(',');						
			$scope.selectedColor = $scope.colorArray[0];
			$scope.selectedImage = $scope.product.images[0];							
		})
		.catch(function(response){
			alert("Server is error, please try again")
		});
    }
	$scope.getProdById();
	$scope.getMyColor = function(color){
		$scope.selectedColor = color;			
	}
	$scope.getMySize = function(size){
		$scope.selectedSize = size;
	} 
	$scope.getMyImage = function(image){
		$scope.selectedImage = image;
	}
	$scope.getNumber = function(num){
		return new Array(num);
	}
	$scope.getReviewByProd = function(){
		$http({
			url: "/no-auth/review/find-by-prod?productId=" + $scope.productId,
			method: "GET"
		})
		.then(function(res){			
			$scope.reviews = res.data;		
			console.log("reviews: ", $scope.reviews);											
		})
		.catch(function(response){
			alert("Server is error, please try again")
		});		
	}
	$scope.getReviewByProd();
   
}]);

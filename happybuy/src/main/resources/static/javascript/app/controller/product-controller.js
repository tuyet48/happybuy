happybuy.controller('ProductCtrl', ['$scope', '$routeParams', '$http', '$rootScope', 'CartService',
	function ($scope, $routeParams, $http, $rootScope, cartService) {
		$scope.productId = $routeParams.productId;
		$rootScope.qty = 0;
		
		$scope.getProdById = function () {
			$http({
				url: "/rest/no-auth/product/find-id?id=" + $scope.productId,
				method: "GET"
			})
				.then(function (res) {
					$scope.product = res.data;
					console.log("product: ", $scope.product);
					$scope.sizeArray = $scope.product.size.split(',');
					$scope.colorArray = $scope.product.color.split(',');
					$scope.selectedColor = $scope.colorArray[0];
					$scope.selectedImage = $scope.product.images[0];
				})
				.catch(function (response) {
					alert("Server is error, please try again")
				});
		}
		$scope.getProdById();

		$scope.getMyColor = function (color) {
			$scope.selectedColor = color;
		}
		$scope.getMySize = function (size) {
			$scope.selectedSize = size;
		}
		$scope.getMyImage = function (image) {
			$scope.selectedImage = image;
		}
		$scope.getNumber = function (num) {
			return new Array(num);
		}
		$scope.getReviewByProd = function () {
			$http({
				url: "/rest/no-auth/review/find-by-prod?productId=" + $scope.productId,
				method: "GET"
			})
				.then(function (res) {
					$scope.reviews = res.data;
					console.log("reviews: ", $scope.reviews);
				})
				.catch(function (response) {
					alert("Server is error, please try again")
				});
		}
		$scope.getReviewByProd();
		$scope.showReview = false;
		$scope.showReviewClick = function(){
			$scope.showReview = !$scope.showReview;
		};
		var itemList = [];

		$scope.addToCart = function(){
			if(localStorage.getItem("qty") != undefined){
				console.log("if is running");
				console.log($scope.selectedQty);
				$rootScope.qty = parseInt(localStorage.getItem("qty")) + $scope.selectedQty;
			}else{
				$rootScope.qty = $scope.selectedQty;	
				console.log("else is running");
			}
			localStorage.setItem("qty", $rootScope.qty);
			//console.log("Qty from Local Storage=", parseInt());			
			//$rootScope.qty = parseInt(localStorage.getItem("qty")) + $scope.selectedQty;							
			//localStorage.setItem("qty", $rootScope.qty);
			//cartService.saveSelectedProduct($scope.product);
			
			/*var item = $scope.product;
			console.log("one item:", item);	
			itemList.push(item);
			console.log("Length: ", itemList.length);
			console.log("list item:", itemList)
			localStorage.setItem("products", itemList)	*/
			$scope.product.quantity = $scope.selectedQty;
			cartService.saveSelectedProduct($scope.product);
			/* $scope.name = $scope.product.name;
			localStorage.setItem("name", $scope.name);
			console.log("Product Name: ", $scope.name); */
		};
	}]);


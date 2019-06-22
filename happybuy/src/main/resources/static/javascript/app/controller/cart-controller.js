happybuy.controller('CartCtrl', ['$scope','CartService', function($scope, cartService){
    $scope.loadItemToCart = function(){
        var items = cartService.getSelectProducts();
        $scope.products = JSON.parse(items);
        console.log("=====products ", $scope.products);        
    }
    $scope.loadItemToCart();
}]);

var happybuy = angular.module('happybuy', ['ngRoute']);
happybuy.config(function ($routeProvider) {
    $routeProvider
        .when('/home', {
            templateUrl: 'views/home.html',
            controller: 'HomeCtrl'
        })      
        .when('/product/:productId', {
            templateUrl: 'views/product-detail.html',
            controller: 'ProductCtrl'
        })
        .when('/category/:categoryId',{
            templateUrl: 'views/category-product.html',
            controller: 'CategoryProductCtrl'
        })
        .when('/cart',{
            templateUrl: 'views/cart.html',
            controller: 'CartCtrl'
        })      
        .when('/checkout',{
            templateUrl: 'views/checkout.html',
            controller: 'CheckoutCtrl'
        })
        .otherwise({
            redirectTo: '/home'
        });
});




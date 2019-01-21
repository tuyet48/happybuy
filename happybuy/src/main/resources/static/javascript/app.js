var happybuy = angular.module("happybuy", ["ngRoute"]);
happybuy.config(function ($routeProvider) {
    $routeProvider
        .when("/home", {
            templateUrl: "views/home.html",
            controller: "HomeCtrl"
        })       
        .when("/about", {
            templateUrl: "views/about.html",
            controller: "AboutCtrl"
        })        
        .when("/product/:productId", {
            templateUrl: "views/product-detail.html",
            controller: "ProductCtrl"
        })
        .when("/category/:categoryId",{
            templateUrl: "views/category-product.html",
            controller: "CategoryProductCtrl"
        })
        .otherwise({
            redirectTo: '/home'
        });
});


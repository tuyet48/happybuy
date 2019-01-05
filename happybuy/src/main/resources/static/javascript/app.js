var happybuy = angular.module("happybuy", ["ngRoute"]);
happybuy.config(function ($routeProvider) {
    $routeProvider
        .when("/home", {
            templateUrl: "views/home.html",
            controller: "HomeCtrl"
        })
        .when("/women", {
            templateUrl: "views/women.html",
            controller: "WomenCtrl"
        })
        .when("/about", {
            templateUrl: "views/about.html",
            controller: "AboutCtrl"
        })
        .when("/contact", {
            templateUrl: "views/contact.html",
            controller: "ContactCtrl"
        })
        .when("/product", {
            templateUrl: "views/product.html",
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


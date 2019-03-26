happybuy.controller('IndexCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.getRequest = function () {           
        $http.get("/rest/no-auth/category/find-all")
            .then(function successCallback(response) {
                $scope.categories = response.data;               
            }, function errorCallback(response) {
                alert("Cannot connect to server, please try again!");
        });
    }
    $scope.getRequest();

    $scope.registerFunc = function () { 
        console.log("register function");
    }


}]);
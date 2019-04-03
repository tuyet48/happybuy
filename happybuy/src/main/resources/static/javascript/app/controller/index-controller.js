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


    //tạo object $scope.credentials chứa email và password
    $scope.credentials = {};

    $scope.register = function () {
        console.log("Data will be sent: ", $scope.credentials);
        $http({
			url: '/rest/no-auth/register',
			method: 'POST',
			data: $scope.credentials
			//headers: authService.createAuthorizationTokenHeader()
		})
		.then(function(response) {
			console.log(response);
		})
		.catch(function(error) {
			console.log(error);
		});
    }
}]);
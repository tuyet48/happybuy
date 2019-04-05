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

    $scope.validateEmail = function(email) {
        var email = $scope.credentials.email;  
        console.log("Email:", email);    
        var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(String(email).toLowerCase());         
    }

    $scope.validateEmail();

    $scope.validation = function(){
        console.log("Credentials: ", $scope.credentials);
        if ($scope.credentials.fname == undefined || $scope.credentials.fname.length == 0){
            $scope.errorMessage = "First name should not be empty!";         
            return false;   
        }else if ($scope.credentials.fname.length > 30){
            $scope.errorMessage = "First name should be with 1-30 characters!";        
            return false;                 
        }else if ($scope.credentials.lname == undefined || $scope.credentials.lname.length == 0){
            $scope.errorMessage = "Last name should not be empty!";        
            return false;
        }else if ($scope.credentials.lname.length > 30){
            $scope.errorMessage = "Last name should be with 1-30 characters!";        
            return false;     
        }else if ($scope.credentials.email == undefined || $scope.credentials.email.length == 0){
            $scope.errorMessage = "Email should not be empty!";
            return false; 
        } else if ($scope.validateEmail() == false) {
            $scope.errorMessage = "Email is not invalid!";
            return false;           
        } else if ($scope.credentials.password == undefined || $scope.credentials.password.length == 0) {
            $scope.errorMessage = "Password should not be empty!";
            return false;
        }else if ($scope.credentials.password.length < 8){
            $scope.errorMessage = "Password should be minimum of 8 characters!";        
            return false; 
        } else if($scope.credentials.cfpassword != $scope.credentials.password) {
            $scope.errorMessage = "Password is not matched!";
            return false;        
        }
        return true;     
    }

    $scope.register = function () {
        console.log("Data will be sent: ", $scope.credentials);
        if ($scope.validation() == true){       
            console.log("Dang goi api tu BE");  
            /*$http({
                url: '/rest/no-auth/register',
                method: 'POST',
                data: $scope.credentials			
            })
            .then(function(response) {          
                 $('#myRegForm').modal('toggle'); 
                 $scope.fname = response.data.data.fname;
                 $scope.lname = response.data.data.lname;                
            })
            .catch(function(error) {
                $scope.errorMessage = error.data.errorMessage;
            }); */      
        }       
    }
}]);
var app=angular.module('adminController',[]);
var adm={username:"",
    password:"",
    logedIn:false};
app.controller('loginCtrl',['$scope','$location',
    function($scope,$location){

        $scope.admin={username:"",
            password:"",
            logedIn:false};
        $scope.login = function() {
            if($scope.admin.password=="admin" &&
                $scope.admin.username=="admin"){
                $scope.admin.logedIn=true;
                adm=$scope.admin;
                $location.path('/callAdmin');
            }
            else{
                alert("Wrong user name or password");

            }
        }
    }]);
app.controller('manageCallCtrl',['$scope','$location','getCalls','upCalls',
    function($scope,$location,getCalls,upCalls){
        $scope.calls=[{}];
        $scope.wait=[{}];
        $scope.accept=[{}];
        $scope.denie=[{}];
        $scope.filterON=false;
        $scope.filterCriteria="";
        var init = function () {
        	if(adm.logedIn){
          $scope.calls=getCalls.query();
            }
            else $location.path('/')
           
        };
        init();
        $scope.modCall = function (call) {
           upCalls.modify(call);
        };

        $scope.filterCalls = function () {
            if($scope.filterON){
            $scope.calls= _.filter($scope.calls, function(call){
                return call.status=$scope.filterCriteria;
            })
            }
            else init();
        };







    }]);


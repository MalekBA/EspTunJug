angular.module('adminApp',['ngRoute','adminController','callServices'])
    .config(function($routeProvider){

            $routeProvider.when('/',{
                templateUrl:'./templates/login.html',
                controller:'loginCtrl'
            });
            $routeProvider.when('/callAdmin',{
                templateUrl:'./templates/dashboard.html',
                controller:'manageCallCtrl'
            });
    });



   






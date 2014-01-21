angular.module('etjApp',['ngRoute','callServices','callControllers'])
    .config(function($routeProvider){

    $routeProvider.when('/', {
        templateUrl: './templates/home.html'


    });
    $routeProvider.when('/jugDay/CallForPaper', {
        templateUrl: './templates/jugDay/CallForPaperForm.html',
        controller:'callCtrl'
    });
    
    $routeProvider.when('/EspTunJug', {
        templateUrl: './templates/tunisianJUG.html'
    });
    $routeProvider.when('/jugDay/JugDay2013', {
        templateUrl: './templates/jugday2013.html'
    });
    $routeProvider.when('/jugDay/gallery',{
        templateUrl:'./templates/gallery.html'
    });
    $routeProvider.when('/contact',{
        templateUrl:'./templates/contact.html',
    controller:'ContactCtrl'
    });
    $routeProvider.when('/about',{
        templateUrl:'./templates/about.html'
    });
    $routeProvider.when('/community',{
        templateUrl:'./templates/community.html'
    });

});



var app = angular.module('app', ['ngRoute']);

app.value('apiUrl', 'http://localhost:8080');

app.config(function($routeProvider){

    $routeProvider.when('/', {
        templateUrl:'../static/views/home.html',
        controller: 'homeController'
    }).otherwise({
        redirectTo: '/'
    });
});

app.run(function(){
    console.log("run");
});
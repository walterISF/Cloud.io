app.controller('homeController', ['$scope', '$http', 'apiUrl', function($scope, $http, apiUrl){

    $scope.saveClient = function(){
        $http.get(apiUrl + '/client').then(
            function(result){
                console.log(result.data);
            },
            function(result){
                console.log(result.data);
            }
        );
    }

}]);
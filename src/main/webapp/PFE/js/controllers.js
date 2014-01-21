var app=angular.module('callControllers',[]);

   app.controller('callCtrl',['$scope','addCall','$location',
       function($scope,addCall,$location){

        $scope.callFor_Paper={fName:"",
            lName:"",
            mail:"",
            facebook:"",
            twitter:"",
            topic:"",
            description:"",
            callType:"Talk",
            status:"waiting",
            accepted:false,
            readen:false};
       $scope.sendCall = function() {

           if($scope.callFor_Paper.fName.toString()==""||
               $scope.callFor_Paper.lName.toString()==""||
               $scope.callFor_Paper.mail.toString()==""||
               $scope.callFor_Paper.description.toString()==""){
               alert("First name , Last name , E-mail address and description are required");
           }
           else{
        	   addCall.save($scope.callFor_Paper)
        	   alert("Call For Paper sent");
               $location.path('/');
               
               }
       }
   }]);
   
   
   app.controller('ContactCtrl',['$scope','send','$location',function($scope,send,$location){
	    $scope.mess ={from:"",subject:"",body:""}

	        $scope.doContact= function (){


	           send.sendM($scope.mess)
	            alert("mail sent!");
	            $location.path('/');
	        }





	}]);


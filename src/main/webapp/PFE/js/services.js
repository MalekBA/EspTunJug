var callServices= angular.module('callServices',['ngResource']);
callServices.factory('addCall',function($resource){
   return $resource('http://localhost:8181/EspTunJugWeb/ws/call/send',
       {},{
           query: { method: 'GET', isArray: true },
           save:{method:'POST',format: 'json', isArray:false
           }
       })
});
callServices.factory('send',function($resource){
    return $resource('http://localhost:8181/EspTunJugWeb/ws/mail/send',
        {},{
            sendM:{method:'POST',format:'JSON', isArray:false }
        })
});
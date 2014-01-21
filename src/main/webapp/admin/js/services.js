var callServices= angular.module('callServices',['ngResource']);
callServices.factory('getCalls',function($resource){
   return $resource('http://localhost:8181/EspTunJugWeb/ws/call/getAll',
       {},{
           query: { method: 'GET', isArray: true }
       })
});

callServices.factory('upCalls',function($resource){
    return $resource('http://localhost:8181/EspTunJugWeb/ws/call/update',
        {},{

            modify:{method:'POST' ,format: 'json', isArray:false}
        })
});
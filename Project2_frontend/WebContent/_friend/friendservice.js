app.factory('FriendService',function($http){
	var friendService={}
	var BASE_URL="http://localhost:8089/project_backend"
		
		
	friendService.getAllUsers=function(){
		return $http.get(BASE_URL + "/getAllUsers");
	}
	
	friendService.sendFriendRequest=function(username){
		return $http.put(BASE_URL + "/friendRequest/"+ username);
	}
	
	return friendService;
})
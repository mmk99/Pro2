app.factory('UserService',function($http){
	var userService={}
	var BASE_URL="http://localhost:8089/project_backend"
	
	userService.registerUser=function(user){
		return $http.post(BASE_URL+"/register",user);
	}
	
	userService.login=function(user){
		return $http.post(BASE_URL + "/login",user);
	}
	userService.logout=function(){
		return $http.put(BASE_URL + "/logout");
	}
	return userService;
})	
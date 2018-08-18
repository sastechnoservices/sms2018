DigiSchoolApp.config(function($routeProvider,ApplicationURL,Controllers){
	$routeProvider
		.when('/', {
			templateUrl : ApplicationURL.loginhtml,
			controller : Controllers.LoginController
		});
});
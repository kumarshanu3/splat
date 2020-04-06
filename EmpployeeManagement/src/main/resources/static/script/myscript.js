(function(){
	var empApp = angular.module("EmployeeApp", []);
	
	var empdata = {};
	
	var setEmp = function(response) {
		var data = response.data;
		empdata.firstName = data.firstName;
		empdata.lastName = data.lastName;
	}
	
	var empCtrl = function($scope, $http) {
		$http.get("/hrms/employees/")
				.then(setEmp);
		$scope.empdata = empdata;
	};
	
	empApp.controller("EmpController", empCtrl);
}());
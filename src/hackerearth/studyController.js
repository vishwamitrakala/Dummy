
mainapp.controller("studyController", function($scope){
$scope.student={
	firstName:"Vicky",
	lastName:"Kala",
	fees:500,
	subjects:[
	{name:'Phy',marks:85},
	{name:'Chem',marks:95},
	{name:'Math',marks:90},
	{name:'Comp',marks:82}
	],
	fullName:function(){
		var studentObject=$scope.student;
		return studentObject.firstName+ " " +studentObject.lastName;
	}
};
});
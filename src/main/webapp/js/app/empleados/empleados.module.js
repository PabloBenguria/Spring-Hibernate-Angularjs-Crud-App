'use strict';

function EmpleadoCtrl(EmpleadoSrv){
	
	var vm = this;
	var resetEmpleados = [];

	vm.editable = true;
	vm.currentPage = 0;
	vm.pageSize = 10;
	
	function getEmpleados(){
		vm.empleados = EmpleadoSrv.query();
	}
	
	getEmpleados();
	
	vm.setEditable = function(index){
		//resetEmpleados = angular.copy(vm.empleados);
		vm.editable = false;
		index = index + (vm.currentPage * vm.pageSize);
		let objSliced = vm.empleados.slice(index, index+1);
		vm.empleado = objSliced[0];
	}
	
	vm.setNotEditable = function(){
		vm.editable = true;
		vm.empleado = {};
		//vm.empleados = resetEmpleados;
		getEmpleados();
	}
	
	vm.crearEmpleado = function(){
		EmpleadoSrv.save(vm.empleado, function(){
			//vm.empleados.push(vm.empleado);
			vm.empleado = {};
			getEmpleados();
		});
	};
	
	vm.editarEmpleado = function(){
		EmpleadoSrv.update(vm.empleado, function(){
			//vm.empleados.splice(vm.empleados.indexOf(vm.empleado), 1, vm.empleado);
			vm.editable = true;
			vm.empleado = {};
			getEmpleados();
		});
	};
	
	vm.remainingPage = function(){
		return Math.ceil(vm.filtered.length/vm.pageSize);
	}
	
}

angular.module('empleados', ['EmpleadoSrv'])
	.component('empleadosComponent', {
		templateUrl: 'js/app/empleados/empleados.html',
		controller: EmpleadoCtrl
});
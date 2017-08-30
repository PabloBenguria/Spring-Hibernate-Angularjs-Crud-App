'use strict';

function ClienteCtrl(ClienteSrv){
	
	var vm = this;
	var resetClientes = [];

	vm.editable = true;
	vm.currentPage = 0;
	vm.pageSize = 10;
	
	function getClientes(){
		vm.clientes = ClienteSrv.query();
	}
	
	getClientes();
	
	vm.setEditable = function(index){
		//resetClientes = angular.copy(vm.clientes);
		index = index + (vm.currentPage * vm.pageSize);
		let objSliced = vm.clientes.slice(index, index+1);
		vm.cliente = objSliced[0];
		vm.editable = false;
	}
	
	vm.setNotEditable = function(){
		vm.editable = true;
		vm.cliente = {};
		//vm.clientes = resetClientes;
		getClientes();
	}
	
	vm.crearCliente = function(){
		ClienteSrv.save(vm.cliente, function(){
			//vm.clientes.push(vm.cliente);
			vm.cliente = {};
			getClientes();
		});
	};
	
	vm.editarCliente = function(){
		ClienteSrv.update(vm.cliente, function(){
			//vm.clientes.splice(vm.clientes.indexOf(vm.cliente), 1, vm.cliente);
			vm.editable = true;
			vm.cliente = {};
			getClientes();
		});
	};
	
	vm.remainingPage = function(){
		return Math.ceil(vm.filtered.length/vm.pageSize);
	}
	
}

angular.module('clientes', ['ClienteSrv'])
	.component('clientesComponent', {
		templateUrl: 'js/app/clientes/clientes.html',
		controller: ClienteCtrl
});
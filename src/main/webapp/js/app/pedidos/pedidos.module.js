'use strict';

function PedidoCtrl(PedidoSrv, ClienteSrv, EmpleadoSrv){
	
	var vm = this;
	var resetPedidos = [];

	vm.editable = true;
	vm.currentPage = 0;
	vm.pageSize = 10;
	
	function getPedidos(){
		vm.pedidos = PedidoSrv.query();
	}
	
	getPedidos();
	
	vm.clientes = ClienteSrv.query();
	vm.empleados = EmpleadoSrv.query();
	
	vm.setEditable = function(index){
		//resetPedidos = angular.copy(vm.pedidos);
		vm.editable = false;
		index = index + (vm.currentPage * vm.pageSize);
		let objSliced = vm.pedidos.slice(index, index+1);
		vm.pedido = objSliced[0];
	}
	
	vm.setNotEditable = function(){
		vm.editable = true;
		vm.pedido = {};
		//vm.pedidos = resetPedidos;
		getPedidos();
	}
	
	vm.crearPedido = function(){
		var formatDate = vm.pedido.fechapedido;
		var day = formatDate.getDate();
		var month = formatDate.getMonth()+1;
		var year = formatDate.getYear();
		var result = (year + 1900) + '-' + month + '-' + day;
		vm.pedido.fechapedido = new Date(result);
		PedidoSrv.save(vm.pedido, function(){
			//vm.pedidos.push(vm.pedido);
			vm.pedido = {};
			getPedidos();
		});
	};
	
	vm.editarPedido = function(){
		PedidoSrv.update(vm.pedido, function(){
			//vm.pedidos.splice(vm.pedidos.indexOf(vm.pedido), 1, vm.pedido);
			vm.editable = true;
			vm.pedido = {};
			getPedidos();
		});
	};
	
	vm.remainingPage = function(){
		return Math.ceil(vm.filtered.length/vm.pageSize);
	}
	
}

angular.module('pedidos', ['PedidoSrv', 'ClienteSrv', 'EmpleadoSrv'])
	.component('pedidosComponent', {
		templateUrl: 'js/app/pedidos/pedidos.html',
		controller: PedidoCtrl
});
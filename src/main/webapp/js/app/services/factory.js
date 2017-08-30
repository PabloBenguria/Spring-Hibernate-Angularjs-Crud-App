'use strict'

angular.module('ClienteSrv', [])
	.factory('ClienteSrv', function($resource){
		var url = 'api/clientes/:id';
		return $resource(url, {id: '@id'}, {update: {method: 'PUT'}, isArray: true});
	});

angular.module('EmpleadoSrv', [])
	.factory('EmpleadoSrv', function($resource){
		var url = 'api/empleados/:id';
		return $resource(url, {id: '@id'}, {update: {method: 'PUT'}, isArray: true});
	});

angular.module('PedidoSrv', [])
	.factory('PedidoSrv', function($resource){
		var url = 'api/pedidos/:id';
		return $resource(url, {id: '@id'}, {update: {method: 'PUT'}, isArray: true});
	});
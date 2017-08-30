'use strict';

angular.module('myApp', ['ngResource', 'ui.router', 'menu', 'paginateFilter', 'clientes', 'empleados', 'pedidos'])

	.config(['$qProvider', '$stateProvider', '$urlRouterProvider', '$httpProvider', '$locationProvider', function($qProvider, $stateProvider, $urlRouterProvider, $httpProvider, $locationProvider){
	
		$qProvider.errorOnUnhandledRejections(false);
		
		$locationProvider.html5Mode(true);

		$urlRouterProvider.otherwise('clientes');
	
		$stateProvider
			.state('clientes', {
		      url: '/clientes',
		      template: '<clientes-component></clientes-component>'
		    })
		    .state('empleados', {
		      url: '/empleados',
		      template: '<empleados-component></empleados-component>'
		    })
		    .state('pedidos', {
		      url: '/pedidos',
		      template: '<pedidos-component></pedidos-component>'
		    })
}]);
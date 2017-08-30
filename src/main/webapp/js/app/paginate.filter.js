'use strict';

angular.module('paginateFilter', [])
	.filter('paginateFilter', function(){
		return function(input, start){
			if(input){
				start = +start;
				return input.slice(start);
			}
			return [];
		}
	});


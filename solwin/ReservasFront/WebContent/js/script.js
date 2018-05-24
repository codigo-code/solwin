(function() {

	var app = angular.module('app', []);

	app.controller('controladorBody', function($scope, $http) {

		$scope.inputApi = function(){
			//console.log($scope.pepe);
			$http({
				method: "POST",
				url: "http://localhost:8080/save",
				data: angular.toJson($scope.pepe),
				headers:{
					'Content-Type':'application/json'
				}
			}).then(function(success){
				alert("inserto el objeto");
			},function(err){
				console.log(err);
			})

					
		}

		
	});
	
	app.controller('controladorX',function($scope){
		$scope.pedo="oloroso";
	});
	
	app.component('kevinPerotti',{
		
		templateUrl:'funcionalidad.html',
		controller:function($scope){
			$scope.mensaje = 'vamos perotti q consiguio sanguchitos 8==D';
		}
	});
	
	
	app.component('abmBar',{
		
		templateUrl:'formGetBar.html',
		controller:function($scope,$http){
			
			$scope.callApi = function(v) {
				var id = v.idBar;
				$http.get("http://localhost:8080/getBar/" + id).then(
						function(resp) {
							console.log(resp.data);
							if (resp.data.value !== undefined) {
								$scope.nombreBar = resp.data.value.nombre;
								$scope.capacidad = resp.data.value.cantPersonas;
								$scope.precio = resp.data.value.precio;
							} else
								alert("no tengo el dato solicitado");
						}, function(err) {
							alert("Error en el api");
						});

			}	
		}
	});

})();

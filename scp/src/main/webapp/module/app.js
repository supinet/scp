(function() {
	var app = angular.module('store', []);

	app.controller('StoreController', function() {
		this.products = gems;
	});

	var gems = [
			{
				name : 'Celular Samsung S3',
				description : 'Some gems have hidden qualities beypond their luster, beyond their shine... Dodeca is one pf those gems',
				price : 1200.95,
				images: [
				      {
				        full: 'cel-samsung-s3-01-full.jpg',
				        thumb: 'cel-samsung-s3-01-thumb.jpg'
				      },
				      {
					    full: 'cel-samsung-s3-02-full.jpg',
					    thumb: 'cel-samsung-s3-02-thumb.jpg'
					  }
				    
				],
				canPurchase : true,
				soldOut : false,
			}, 
			{
				name : 'Playstation III',
				description : 'Playstation III ótimo estado de conservação',
				price : 400.95,
				images: [
					      {
					        full: 'playstation-01-full.jpg',
					        thumb: 'playstation-01-thumb.jpg'
					      },
					      {
						    full: 'playstation-02-full.jpg',
						    thumb: 'playstation-02-thumb.jpg'
						  }
					    
					],
				canPurchase : true,
				soldOut : false,
			} 
	];
})();
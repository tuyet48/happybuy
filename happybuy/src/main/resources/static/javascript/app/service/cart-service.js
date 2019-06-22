happybuy.factory('CartService', function($http) {	
	var addedItemList = [];

	var saveSelectedProduct = function(product){
		addedItemList.push(product);
		localStorage.setItem("orderList", JSON.stringify(addedItemList));
	}
	
	var getSelectProducts = function() {
		return localStorage.getItem("orderList");;
	};

	return {
		saveSelectedProduct : saveSelectedProduct,
		getSelectProducts : getSelectProducts
	};
	
});
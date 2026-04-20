package customerOrders.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import customerOrders.modal.Product;

@Component
public class InventoryService {
	Map<Integer, Product> productsMap;
	
	public InventoryService() {
		productsMap = new HashMap<>();
	}
	
	@Autowired
	public void addProduct(Product product, Integer quantity) {
		productsMap.put(quantity, product);
	}
	
	
	public Product getProductById(Long id) {
		for(Product product : productsMap.values()) {
			if(product.getId().equals(id)) {
				return product;
			}
		}
		return null;
	}
}

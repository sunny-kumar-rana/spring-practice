package customerOrders.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import customerOrders.modal.Product;

@Component
public class InventoryService {
	Map<Long, Product> productsMap;
	
	public InventoryService() {
		productsMap = new HashMap<>();
	}
	
	public void addProduct(Product product) {
		productsMap.put(product.getId(), product);
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

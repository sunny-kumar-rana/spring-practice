package customerOrders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import customerOrders.modal.Product;

@Component
public class OrderService {
	InventoryService inventoryService;
	PaymentService paymentService;
	
	@Autowired
	public OrderService( InventoryService inventoryService, PaymentService paymentService) {
		this.inventoryService = inventoryService;
		this.paymentService = paymentService;
	}
	
	public void placeOrder(Long productId, int quantity) {
		Product product = inventoryService.getProductById(productId);
		double amount = product.getPrice()*quantity;
		System.out.println(product);
		
		paymentService.processPayment(amount);
	}
}

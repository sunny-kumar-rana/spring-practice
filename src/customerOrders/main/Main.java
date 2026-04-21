package customerOrders.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import customerOrders.modal.Product;
import customerOrders.service.InventoryService;
import customerOrders.service.OrderService;
import customerOrders.springConfig.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		InventoryService inventoryService = context.getBean(InventoryService.class);
		inventoryService.addProduct(new Product(123l, "balloons", 27));
		
		
		OrderService order = context.getBean(OrderService.class);
		order.placeOrder(123l, 3);
		
	}
}

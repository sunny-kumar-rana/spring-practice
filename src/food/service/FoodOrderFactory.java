
package food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import food.order.foodOrder.FoodOrder;

@Component
public class FoodOrderFactory {
	@Autowired
	private ApplicationContext context;

	public FoodOrder getOrder(String item) {
		switch (item.toLowerCase()) {
		case "pizza":
			return (FoodOrder) context.getBean("pizzaOrder");
		case "burger":
			return (FoodOrder) context.getBean("burgerOrder");
		case "biryani":
			return (FoodOrder) context.getBean("biryaniOrder");
		default:
			throw new IllegalArgumentException("Invalid menu item");
		}
	}
}

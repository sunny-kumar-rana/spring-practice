
package food.order.foodOrder;

import org.springframework.stereotype.Component;

@Component("pizzaOrder")
public class PizzaOrder implements FoodOrder {
	@Override
	public void prepare() {
		System.out.println("Preparing Pizza...");
	}

	@Override
	public int getBillAmount() {
		return 250;
	}
}

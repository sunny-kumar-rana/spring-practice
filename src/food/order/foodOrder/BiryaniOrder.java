
package food.order.foodOrder;

import org.springframework.stereotype.Component;

@Component("biryaniOrder")
public class BiryaniOrder implements FoodOrder {
	@Override
	public void prepare() {
		System.out.println("Preparing Biryani...");
	}

	@Override
	public int getBillAmount() {
		return 300;
	}
}

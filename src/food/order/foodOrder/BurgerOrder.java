package food.order.foodOrder;

import org.springframework.stereotype.Component;

@Component("burgerOrder")
public class BurgerOrder implements FoodOrder {
	@Override
	public void prepare() {
		System.out.println("Preparing Burger...");
	}

	@Override
	public int getBillAmount() {
		return 150;
	}
}

package food.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import food.config.AppConfig;
import food.order.foodOrder.FoodOrder;
import food.service.FoodOrderFactory;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		FoodOrderFactory factory = context.getBean(FoodOrderFactory.class);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Food Item: Pizza, Burger, Biryani");
		String choice = scanner.nextLine();

		try {
			FoodOrder order = factory.getOrder(choice);
			order.prepare();
			System.out.println("Bill Amount: ₹" + order.getBillAmount());
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid selection.");
		}
	}
}

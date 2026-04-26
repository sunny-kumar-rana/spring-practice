package delivery.main;

import delivery.service.DeliveryService;
import delivery.strategy.DeliveryStrategy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("delivery");
		DeliveryService service = context.getBean(DeliveryService.class);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Delivery Type: 1. Standard 2. Express 3. Same-Day");
		int choice = scanner.nextInt();

		DeliveryStrategy strategy;
		switch (choice) {
		case 1:
			strategy = (DeliveryStrategy) context.getBean("standardDelivery");
			break;
		case 2:
			strategy = (DeliveryStrategy) context.getBean("expressDelivery");
			break;
		case 3:
			strategy = (DeliveryStrategy) context.getBean("sameDayDelivery");
			break;
		default:
			System.out.println("Invalid choice");
			return;
		}

		service.setDeliveryStrategy(strategy);
		int charge = service.calculateCharge();
		System.out.println("Delivery Charge: ₹" + charge);
	}
}

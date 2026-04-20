package customerOrders.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	public void processPayment(double amount) {
		System.out.println("Payment successfull: amount paid :- " +amount + " rs");
	}
}

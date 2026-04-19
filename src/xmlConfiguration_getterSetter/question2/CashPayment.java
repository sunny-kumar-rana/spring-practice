package xmlConfiguration_getterSetter.question2;

public class CashPayment implements PaymentMethod{
	public String pay(double amount) {
		return "Paid " + amount + " in Cash";
	}
}

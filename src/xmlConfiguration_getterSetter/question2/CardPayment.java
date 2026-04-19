package xmlConfiguration_getterSetter.question2;

public class CardPayment implements PaymentMethod{
	public String pay(double amount) {
		return "Paid " + amount + " using Card";
	}
}
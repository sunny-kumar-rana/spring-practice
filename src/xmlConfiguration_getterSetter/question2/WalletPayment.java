package xmlConfiguration_getterSetter.question2;

public class WalletPayment implements PaymentMethod{
	public String pay(double amount) {
		return "Paid " + amount + " using Wallet";
	}
}
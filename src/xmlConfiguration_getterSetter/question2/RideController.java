package xmlConfiguration_getterSetter.question2;

public class RideController {
	
	private Vehicle vehicle;
	private PaymentMethod paymentMethod;
	
	public RideController(Vehicle vehicle, PaymentMethod paymentMethod) {
		this.vehicle = vehicle;
		this.paymentMethod = paymentMethod;
	}
	
	public String bookRide(double amount) {
		return vehicle.ride() +"\n"+ paymentMethod.pay(amount);
	}
}

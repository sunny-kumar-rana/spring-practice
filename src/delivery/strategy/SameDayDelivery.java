package delivery.strategy;

import org.springframework.stereotype.Component;

@Component("sameDayDelivery")
public class SameDayDelivery implements DeliveryStrategy {
	@Override
	public int calculateCharge() {
		return 200;
	}
}

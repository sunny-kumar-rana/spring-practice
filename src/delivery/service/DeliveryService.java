package delivery.service;

import delivery.strategy.DeliveryStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
	private DeliveryStrategy deliveryStrategy;

	@Autowired
	public DeliveryService(@Qualifier("standardDelivery") DeliveryStrategy deliveryStrategy) {
		this.deliveryStrategy = deliveryStrategy;
	}

	public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
		this.deliveryStrategy = deliveryStrategy;
	}

	public int calculateCharge() {
		return deliveryStrategy.calculateCharge();
	}
}

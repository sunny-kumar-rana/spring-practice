package delivery.strategy;

import org.springframework.stereotype.Component;

@Component("standardDelivery")
public class StandardDelivery implements DeliveryStrategy {
    @Override
    public int calculateCharge() {
        return 50;
    }
}

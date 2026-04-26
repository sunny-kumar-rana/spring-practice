package delivery.strategy;

import org.springframework.stereotype.Component;

@Component("expressDelivery")
public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public int calculateCharge() {
        return 100;
    }
}
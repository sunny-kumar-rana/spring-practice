package ott_subscription_management.provider;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AmazonProvider implements OTTProvider{

	@Override
	public void activateSubscription() {
		System.out.println("Netflix subscription activated");
	}

}

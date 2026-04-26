package ott_subscription_management.provider;

import org.springframework.stereotype.Component;

@Component
public class NetflixProvider implements OTTProvider{

	@Override
	public void activateSubscription() {
		System.out.println("Netflix subscription activated");
	}

}

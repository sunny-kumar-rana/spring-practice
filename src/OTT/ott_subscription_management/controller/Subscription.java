package ott_subscription_management.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ott_subscription_management.provider.OTTProvider;

@Component
public class Subscription {
	OTTProvider provider;
	
	public Subscription(@Qualifier("netflixProvider") OTTProvider provider) {
		this.provider = provider;
	}
	
	public void play() {
		provider.activateSubscription();
	}
}

package ott_subscription_management.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import ott_subscription_management.controller.Subscription;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Subscription sub = context.getBean(Subscription.class);
		
		sub.play();
	}
}

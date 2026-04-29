package learnFactoryBean.notificationFactoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import learnFactoryBean.notification.Notification;

@Component("notification")
public class NotificationFactory implements FactoryBean<Notification>{

	@Override
	public Notification getObject() throws Exception {
		System.out.println("Creating Notification Object");
		return new Notification();
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("Called getObjectType()");
		return Notification.class;
	}
	
}

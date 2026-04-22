package notificationSystem.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import customerOrders.springConfig.AppConfig;
import notificationSystem.dispatcher.NotificationDispatcher;
import notificationSystem.dispatcher.NotificationType;
import notificationSystem.model.Message;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(notificationSystem.config.AppConfig.class);
		
		NotificationDispatcher dispatcher = context.getBean(NotificationDispatcher.class);
		
		dispatcher.dispatch(new Message(121, " hello there. wassup?", "suresh"), NotificationType.EMAIL);
		
	}
}

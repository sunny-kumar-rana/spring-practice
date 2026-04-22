package notificationSystem.notificationImplementation;

import org.springframework.stereotype.Component;

import notificationSystem.interfaces.NotificationService;
import notificationSystem.model.Message;

@Component("PUSH")
public class PushNotificationService implements NotificationService{
	public void send(Message message) {
		System.out.println("Push Notification sent to " + message.getRecipient() + " : " + message.getContent());
	}
}

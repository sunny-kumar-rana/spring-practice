package notificationSystem.notificationImplementation;

import org.springframework.stereotype.Component;

import notificationSystem.interfaces.NotificationService;
import notificationSystem.model.Message;

@Component
public class SmsNotificationService implements NotificationService{
	public void send(Message message) {
		System.out.println("SMS sent to " + message.getRecipient() + " : " + message.getContent());
	}
}

package notificationSystem.notificationImplementation;

import org.springframework.stereotype.Component;

import notificationSystem.interfaces.NotificationService;
import notificationSystem.model.Message;

@Component
public class EmailNotificationService implements NotificationService{
	public void send(Message message) {
		System.out.println("Email sent to " + message.getRecipient() + " : " + message.getContent());
	}
}

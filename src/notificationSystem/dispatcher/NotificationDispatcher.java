package notificationSystem.dispatcher;

import java.util.Map;

import org.springframework.stereotype.Component;

import notificationSystem.interfaces.NotificationService;
import notificationSystem.model.Message;


@Component
public class NotificationDispatcher {
	private Map<String, NotificationService> services;
	
	public NotificationDispatcher(Map<String, NotificationService> services) {
		this.services = services;
	}
	
	public void dispatch(Message message, String type) {
		NotificationService service = services.get(type + "NotificationService");
		
		if(service == null) {
			throw new RuntimeException("invalid notification type");
		}
		
		service.send(message);
	}
}

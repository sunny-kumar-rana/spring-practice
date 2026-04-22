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
	
	public void dispatch(Message message, NotificationType type) {
		NotificationService service = services.get(type.getBeanName());
		
		if(service == null) {
			throw new RuntimeException("invalid notification type");
		}
		
		
		try {
			
			service.send(message);			
			
		} catch (Exception e) {
			
			
			NotificationType next = type.next();
			if(next == null) {
				throw new RuntimeException("All Notification methods failed");
			}
			
			dispatch(message, next);
			return;
			
			
//			---------------OR---------------
//			if (type == NotificationType.EMAIL){
//				dispatch(message, NotificationType.SMS);
//				return;
//			}
//			else if (type == NotificationType.SMS){
//				dispatch(message, NotificationType.PUSH);
//				return;
//			}
//			else {
//				throw new RuntimeException("All Notification methods failed");
//			}
//			
		}
	}
}

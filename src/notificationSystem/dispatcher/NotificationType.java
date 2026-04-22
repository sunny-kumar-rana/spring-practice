package notificationSystem.dispatcher;

public enum NotificationType {
	
	EMAIL("EMAIL") {
		public NotificationType next() {
			return SMS;
		}
	},
	SMS("SMS") {
		public NotificationType next() {
			return PUSH;
		}
	},
	PUSH("PUSH") {
		public NotificationType next() {
			return null;
		}
	};
	
	private final String beanName;
	
	private NotificationType(String beanName) {
		this.beanName = beanName;
	}
	public String getBeanName() {
		return this.beanName;
	}
	
	public abstract NotificationType next();
}

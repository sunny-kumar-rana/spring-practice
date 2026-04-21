package notificationSystem.model;

public class Message {
	long id;
	String content;
	String recipient;
	
	public Message(long id, String content, String recipient) {
		this.id = id;
		this.content = content;
		this.recipient = recipient;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String getRecipient() {
		return this.recipient;
	}
}

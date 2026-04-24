package taskExecutionSystem.model;

public enum TaskType {
	LOCAL_UPLOAD("fileUpload"),
	S3_UPLOAD("fileUpload"),
	
	SMTP("emailSend"),
	THIRD_PARTY_API("emailSend");
	
	private final String category;
	
	TaskType(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return this.category;
	}
}

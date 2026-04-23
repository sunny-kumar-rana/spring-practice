package taskExecutionSystem.model;

public enum TaskType {
	LOCAL_UPLOAD("fileUpload"){
		public TaskType next() {
			return S3_UPLOAD;
		}
	},
	S3_UPLOAD("fileUpload"){
		public TaskType next() {
			return null;
		}
	},
	
	SMTP("emailSend"){
		public TaskType next() {
			return THIRD_PARTY_API;
		}
	},
	THIRD_PARTY_API("emailSend"){
		public TaskType next() {
			return null;
		}
	};
	
	private final String category;
	
	TaskType(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public abstract TaskType next();
}

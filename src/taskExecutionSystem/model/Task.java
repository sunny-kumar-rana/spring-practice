package taskExecutionSystem.model;

public class Task {
	private TaskType type;
	private String payload;
	
	public Task(TaskType type, String payload) {
		this.type = type;
		this.payload = payload;
	}
	
	public TaskType getTaskType() {
		return this.type;
	}
	
	public void setTaskType(TaskType type) {
		this.type = type;
	}
	
	public String getPayload() {
		return this.payload;
	}
}

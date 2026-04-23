package taskExecutionSystem.model;

public class Task {
	private long id;
	private TaskType type;
	private String payload;
	
	public Task(long id, TaskType type, String payload) {
		this.id = id;
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

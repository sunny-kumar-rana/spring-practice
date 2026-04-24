package taskExecutionSystem.executors;

import taskExecutionSystem.model.Task;

public interface TaskExecutor {
	public void execute(Task task);
	public String getCategory();
}

package taskExecutionSystem.dispatcher;

import java.util.Map;

import org.springframework.stereotype.Component;

import taskExecutionSystem.executors.TaskExecutor;
import taskExecutionSystem.model.Task;
import taskExecutionSystem.model.TaskType;

@Component
public class TaskDispatcher {
	private Map<String, TaskExecutor> executorList;
	
	public TaskDispatcher(Map<String, TaskExecutor> executorList) {
		this.executorList = executorList;
	}
	
	public void execute(Task task) {
		
		TaskType taskType = task.getTaskType();
		TaskExecutor te = executorList.get(taskType.name());
		
		if(te == null) {
			
			throw new RuntimeException("invalid Task type / all methods failed");
			
		}
		
		try {
			
			te.execute(task);
			
		} catch (Exception e) {

			task.setTaskType(taskType.next());
			
			execute(task);
			
		} finally {
			
			task.setTaskType(taskType);
			
		}
	}
}

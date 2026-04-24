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
		
		
	}
	
	public void executeWithType(Task task, TaskType taskType) {
		TaskExecutor tx = executorList.get(taskType.name());
		
		if(tx == null) {
			throw new RuntimeException("Invalid type");
		}
		
		try {
			tx.execute(task);
		} catch (Exception e) {
			
			TaskType next = taskType.next();
			
			if(next== null) {
				throw new RuntimeException("All Methods Failed");
			}
			
			executeWithType(task, next);
		}
	}
}

package taskExecutionSystem.dispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import taskExecutionSystem.executors.TaskExecutor;
import taskExecutionSystem.model.Task;

@Component
public class TaskDispatcher {
	private Map<String, List<TaskExecutor>> executorGroup;
	
	public TaskDispatcher(Map<String, TaskExecutor> executorList) {
		
		executorGroup = new HashMap<>();
		
		for(Map.Entry<String, TaskExecutor> entry : executorList.entrySet()) {
			executorGroup.computeIfAbsent(entry.getValue().getCategory(), k -> new ArrayList<>()).add(entry.getValue());
		}
	}
	
	public void execute(Task task) {
		
		String category = task.getTaskType().getCategory();
		
		List<TaskExecutor> executors = executorGroup.get(category);
		
		if(executors == null) {
			throw new RuntimeException("No Executors found");
		}
		
		for(TaskExecutor executor : executors) {
			try {
				executor.execute(task);
				return;
			} catch (Exception e) {
				// blank
			}
		}
		
		throw new RuntimeException("All Methods failed");
		
	}
}

package taskExecutionSystem.executors;

import org.springframework.stereotype.Component;

import taskExecutionSystem.model.Task;

@Component("SMTP")
public class SMTPExecutor implements TaskExecutor {

	@Override
	public void execute(Task task) {
		System.out.println(task.getTaskType().name() + " :-- " +task.getPayload());
	}

}
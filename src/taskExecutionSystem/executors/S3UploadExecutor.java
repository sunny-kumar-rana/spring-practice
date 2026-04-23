package taskExecutionSystem.executors;

import org.springframework.stereotype.Component;

import taskExecutionSystem.model.Task;

@Component("S3_UPLOAD")
public class S3UploadExecutor implements TaskExecutor {

	@Override
	public void execute(Task task) {
		System.out.println(task.getTaskType().name() + " :-- " +task.getPayload());
	}

}
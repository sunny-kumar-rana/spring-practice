package taskExecutionSystem.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import taskExecutionSystem.config.AppConfig;
import taskExecutionSystem.dispatcher.TaskDispatcher;
import taskExecutionSystem.model.Task;
import taskExecutionSystem.model.TaskType;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TaskDispatcher dispatcher = context.getBean(TaskDispatcher.class);
		
		dispatcher.execute(new Task(3450, TaskType.LOCAL_UPLOAD, "i suppose it works yeah?"));
	}
}

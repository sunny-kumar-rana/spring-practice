package spring_AOP.executor;

import org.springframework.stereotype.Component;

@Component
public class Executor {
	public void execute() {
		System.out.println("Executing...");
	}
}

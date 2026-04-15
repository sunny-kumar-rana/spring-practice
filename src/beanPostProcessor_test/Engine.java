package beanPostProcessor_test;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Engine {
	public Engine () {
		System.out.println("engine constructor called - engine object created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method got called");
	}
	
	public void start() {
		System.out.println("Engine Started");
	}
}

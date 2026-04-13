package beanScope_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class Car {
	Engine engine;
	
	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car created - Engine Assigned");
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is Running");
	}
}

package beanPostProcessor_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Car")
@Scope("prototype")
public class Car {
	Engine engine;
	
	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
		
		System.out.println("Car constructor got called - Car instance created");
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is running");
	}
}

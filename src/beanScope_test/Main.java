package beanScope_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanScope.xml");
		
		Car car = context.getBean(Car.class);
		Car car1 = context.getBean(Car.class);
		car.drive();
		System.out.println(car.engine == car1.engine);
	}
}

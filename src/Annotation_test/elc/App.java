package Annotation_test.elc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Annotation_test.blc.Car;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		Car car = context.getBean(Car.class);
		car.drive();
	}
}

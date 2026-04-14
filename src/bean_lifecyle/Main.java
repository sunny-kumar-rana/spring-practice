package bean_lifecyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = context.getBean(Car.class);
		Car car1 = context.getBean(Car.class);
		car.drive();
		car1.drive();
		System.out.println(car.engine == car1.engine);
	}
}

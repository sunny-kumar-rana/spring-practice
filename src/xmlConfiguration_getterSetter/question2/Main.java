package xmlConfiguration_getterSetter.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/xmlConfiguration_getterSetter/question2/rideConfig.xml");
		
		System.out.println(((RideController) context.getBean("carController")).bookRide(4000));
		System.out.println(((RideController) context.getBean("bikeController")).bookRide(3000));
		System.out.println(((RideController) context.getBean("autoController")).bookRide(2000));
	}
}

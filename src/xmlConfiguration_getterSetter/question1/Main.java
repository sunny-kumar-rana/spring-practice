package xmlConfiguration_getterSetter.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/xmlConfiguration_getterSetter/question1/question1Config.xml");
		
		Employee employee = (Employee) context.getBean("empBean");
		
		System.out.println(employee.toString());
	}
}

package question.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("three.xml");
		
		DataService ds = context.getBean("ds",DataService.class);
		ds.getDay();
	}
}

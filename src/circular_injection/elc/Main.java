package circular_injection.elc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import circular_injection.blc.A;
import circular_injection.blc.B;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Circular_injection.xml");
		A a = context.getBean(A.class);
		B b = context.getBean(B.class);
	}
}

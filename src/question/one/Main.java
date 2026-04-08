package question.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DatePrinter.xml");
		
		DatePrinter printer = context.getBean("datePrinter",DatePrinter.class);
		printer.printDate();
	}
}

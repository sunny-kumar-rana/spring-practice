package question.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("question_2.xml");
		DiscountCalculator dc = context.getBean("dc",DiscountCalculator.class);
		dc.setPrice(Double.parseDouble(IO.readln("Enter Price : ")));
		dc.calculateDiscount();
	}
}

package Saturday_test.question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/Saturday_test/question4/config.xml");

        Passenger p = (Passenger) context.getBean("passenger");
        p.display();
    }
}



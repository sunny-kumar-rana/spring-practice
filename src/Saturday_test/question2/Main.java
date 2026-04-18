package Saturday_test.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/Saturday_test/question2/config.xml");

        Employee emp = (Employee) context.getBean("employee");
        emp.display();
    }
}



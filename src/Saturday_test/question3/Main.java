package Saturday_test.question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/Saturday_test/question3/config.xml");

        Faculty faculty = (Faculty) context.getBean("faculty");
        faculty.display();
    }
}




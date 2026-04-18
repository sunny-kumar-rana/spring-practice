package Saturday_test.question1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/Saturday_test/question1/config.xml");

        Cart cart = (Cart) context.getBean("cart");
        cart.display();
    }
}

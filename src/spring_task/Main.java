package spring_task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the context using the configuration class
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the College bean from the container
        College myCollege = context.getBean(College.class);

        // Execute the method to see the injected dependencies
        myCollege.displayDetails();

        // Close the context
        context.close();
    }
}
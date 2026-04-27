package spring_AOP.main;

import spring_AOP.config.AppConfig;
import spring_AOP.executor.Executor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Executor executor = context.getBean(Executor.class);

        executor.execute();
    }
}
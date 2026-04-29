package learnFactoryBean.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learnFactoryBean.config.AppConfig;
import learnFactoryBean.engine.Engine;
import learnFactoryBean.notification.Notification;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Engine engine = context.getBean("engine", Engine.class);
//		
//		engine.start();
//		engine.getClass();
		
		Notification notification = context.getBean("notification",Notification.class);
		notification.show();
	}
}

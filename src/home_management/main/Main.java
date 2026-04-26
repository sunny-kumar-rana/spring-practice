package home_management.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import home_management.controller.ApplianceControllerService;
import home_managementconfig.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ApplianceControllerService controller = context.getBean(ApplianceControllerService.class);

        controller.handleCommand("Turn ON");
        controller.handleCommand("Set temperature to 22°C");
	}
}

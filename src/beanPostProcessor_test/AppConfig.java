package beanPostProcessor_test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("beanPostProcessor_test")
public class AppConfig {
	@Bean
	public BeanPostProcessor processor() {
		return new MyProcessor();
	}
	@Bean
	public Engine engine() {
		return new Engine();
	}
	
//	@Bean
//	public Car car() {
//		return new Car(null);
//	}
}

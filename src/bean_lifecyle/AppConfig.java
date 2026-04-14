package bean_lifecyle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("bean_lifecyle")

public class AppConfig {
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
}

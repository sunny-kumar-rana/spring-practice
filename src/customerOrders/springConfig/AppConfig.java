package customerOrders.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import customerOrders.modal.Product;

@Configuration
@ComponentScan("customerOrders")
public class AppConfig {
	@Bean
	public Product product() {
		return new Product(123, "balloon", 230);
	}
	
	@Bean
	public Integer quantity() {
		return 3;
	}
}

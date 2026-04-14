package bean_lifecyle;

import javax.annotation.*;

public class Engine {
	public Engine(){
		System.out.println("Engine created");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method called");
	}
	public void start() {
		System.out.println("Engine Started");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method called");
	}
}

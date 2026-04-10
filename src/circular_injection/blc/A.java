package circular_injection.blc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {
	B b;
	
	{
		System.out.println("Class A Object Created");
	}
	@Autowired
	@Lazy
	public A(B b) {
		this.b = b;
		System.out.println("Class B Object Added to Class A");
	}
	
//	@Autowired
//	public void setB(B b) {
//		this.b = b;
//		System.out.println("Class B Object Added to Class A");
//	}
}

package circular_injection.blc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class B {
	A a;
	{
		System.out.println("Class B object Created");
	}
	@Autowired
	@Lazy
	public B(A a) {
		this.a = a;
		System.out.println("Class A Object Added to Class B");
	}
	
//	@Autowired
//	public void setA(A a) {
//		this.a = a;
//		System.out.println("Class A Object Added to Class B");
//	}
}

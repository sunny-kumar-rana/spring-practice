package Annotation_test.blc;

import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.Primary;

@Component
//@Primary
public class PetrolEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Petrol Engine Started");		
	}

}
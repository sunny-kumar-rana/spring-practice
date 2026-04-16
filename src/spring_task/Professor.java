package spring_task;

import org.springframework.stereotype.Component;

@Component
public class Professor {
	private String name = "Rajesh";
    private String subject = "Java";

    @Override
    public String toString() {
        return name + " (" + subject + ")";
    }
}

package spring_task;

public class Professor {
	private String name = "Rajesh";
    private String subject = "Java";

    @Override
    public String toString() {
        return name + " (" + subject + ")";
    }
}

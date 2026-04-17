package xmlConfiguration_getterSetter.question1;

public class Employee {
	private String name;
	private Department dept;
	private double salary;
	
	public Employee(String name, Department dept, double salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary="
				+ salary + "]";
	}
}

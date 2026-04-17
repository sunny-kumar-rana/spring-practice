package xmlConfiguration_getterSetter.question1;

public class Department {
	private String deptName;
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + "]";
	}
}

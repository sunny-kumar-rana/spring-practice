package spring_task;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String deptName = "CSE";
    private String building = "Block A";

    @Override
    public String toString() {
        return deptName + " - " + building;
    }
}
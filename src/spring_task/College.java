package spring_task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
    private String collegeName = "ABC Engineering College";
    private Professor professor;
    private Department department;

    @Autowired
    public College(Professor professor, Department department) {
        this.professor = professor;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("College: " + collegeName + 
                           " Professor: " + professor + 
                           " Department: " + department);
    }
}
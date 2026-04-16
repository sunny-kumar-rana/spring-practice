package spring_task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
    private String collegeName = "ABC Engineering College";

    @Autowired
    private Professor professor;

    @Autowired
    private Department department;

    public void displayDetails() {
        System.out.println("College: " + collegeName + 
                           " Professor: " + professor + 
                           " Department: " + department);
    }
}
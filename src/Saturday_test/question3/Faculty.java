package Saturday_test.question3;

public class Faculty {
    private int facultyId;
    private String name;
    private Course course;

    public Faculty(int facultyId, String name, Course course) {
        this.facultyId = facultyId;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Name: " + name);
        System.out.println("Course ID: " + course.getCourseId());
        System.out.println("Course Name: " + course.getCourseName());
    }
}
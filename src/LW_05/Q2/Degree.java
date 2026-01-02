package LW_05.Q2;

import java.util.ArrayList;

public class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void listCoursesOffering() {
        System.out.println("Courses Offered:");
        for (Course c : coursesOffering) {
            System.out.println("- " + c.getName());
        }
    }
}

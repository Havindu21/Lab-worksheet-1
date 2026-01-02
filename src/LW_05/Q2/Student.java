package LW_05.Q2;

import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    public void displayDegreeInfo() {
        if (degree != null)
            degree.displayInfo();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled() {
        System.out.println("Courses Enrolled:");
        for (Course c : coursesEnrolled) {
            System.out.println("- " + c.getName());
        }
    }
}

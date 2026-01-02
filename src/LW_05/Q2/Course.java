package LW_05.Q2;

public class Course {
    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, Integer numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Enroll Type: " + enrollType);
        System.out.println("Students Enrolled: " + numberOfStudentsEnrolled);
    }

    public String getName() {
        return name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public Integer getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public void setNumberOfStudentsEnrolled(Integer numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
    }

    public void removeLecturerInCharge() {
        this.lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degree) {
        this.degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo() {
        this.degreeBelongsTo = null;
    }
}
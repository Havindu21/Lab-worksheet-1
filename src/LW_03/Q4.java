package LW_03;

public class Q4 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Mr. Kesavan");
        lecturer.setCourseTeaching("Object Oriented Programming");

        Course course = new Course();
        course.setCourseName("Object Oriented Programming");
        course.setCourseCode("CSCI21052");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Havindu");
        student.setDegreeName("BSc in Computer Science");
        student.setCourseFollowing(course.getCourseName());

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("Lecturer teaching: " + course.getLecturer().getCourseTeaching());
        System.out.println("Student: " + student.getStudentName());
        System.out.println("Degree: " + student.getDegreeName());
        System.out.println("Course following: " + student.getCourseFollowing());
    }
}

package LW_05.Q2;

public class Main{
    public static void main(String[] args) {

        Department seDept = new Department("Software Engineering");
        Degree csDegree = new Degree("Computer Science", 120);

        Course oop = new Course("Object-Oriented Programming", "Compulsory", 80);

        Lecturer lec1 = new Lecturer("Dr. Silva", "Senior Lecturer", seDept);
        Student stu1 = new Student("Kamal", "SE2023/001", "2nd Year");

        seDept.addLecturer(lec1);
        seDept.appointDepartmentHead(lec1);
        seDept.offerCourse(oop);

        csDegree.offerCourse(oop);

        oop.addLecturerInCharge(lec1);
        oop.addDegreeBelongsTo(csDegree);

        lec1.addCourse(oop);

        stu1.registerDegree(csDegree);
        stu1.enrollCourse(oop);

        System.out.println("\n====== Lecturer Info ======");
        lec1.displayInfo();
        lec1.listCoursesTeaching();

        System.out.println("\n====== Student Info ======");
        stu1.displayInfo();
        stu1.listCoursesEnrolled();

        System.out.println("\n====== Department Info ======");
        seDept.displayInfo();
        seDept.displayDepartmentHeadInfo();

        System.out.println("\n====== Course Info ======");
        oop.displayInfo();

        System.out.println("\n====== Degree Info ======");
        csDegree.displayInfo();
        csDegree.listCoursesOffering();
    }
}

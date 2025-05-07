
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class StudentProgram {
    String name;
    LocalDate dob;
    String[] courses = new String[3];
    int[] marks = new int[3];

    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        dob = LocalDate.parse(sc.nextLine());
    }

    public void displayStudentInfo() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    public void getCourseDetails() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter course name: ");
            courses[i] = sc.nextLine();
            System.out.print("Enter marks for " + courses[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }
    }

    public void displayCourseDetails() {
        System.out.println("Courses and Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }

    public static void main(String[] args) {
        StudentProgram student = new StudentProgram();
        student.getStudentDetails();
        student.displayStudentInfo();
        student.getCourseDetails();
        student.displayCourseDetails();}}
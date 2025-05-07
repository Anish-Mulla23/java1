import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

class Person {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge(String dobStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = sdf.parse(dobStr);
        Date current = new Date();

        long ageInMillis = current.getTime() - dob.getTime();
        long age = ageInMillis / (1000L * 60 * 60 * 24 * 365);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;
    double salary;

    public void setEmployeeDetails(int id, double sal) {
        this.empId = id;
        this.salary = sal;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        String dob = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();

        emp.displayName();
        emp.displayAge(dob);
        emp.setEmployeeDetails(id, sal);
        emp.displayEmployeeDetails();
    }
}
import java.util.*;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;
    Member(String name, int age, String phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public void printSalary() {
        System.out.println("Salary = "+this.salary);
    }
    public void printDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Phone number: "+this.phoneNumber);
        System.out.println("Address: "+this.address);
        printSalary();
    }
}
class Employee extends Member {
    String specialization;
    Employee(String name, int age, String phoneNumber, String address, int salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}
class Manager extends Member {
    String department;
    Manager(String name, int age, String phoneNumber, String address, int salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}
public class Lab6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee");
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter phone number");
        String phoneNumber = sc.nextLine();
        phoneNumber = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        System.out.println("Enter salary");
        int salary = sc.nextInt();
        System.out.println("Enter specialization");
        String specialization = sc.nextLine();
        specialization = sc.nextLine();
        Employee emp1 = new Employee(name,age,phoneNumber,address,salary,specialization);
        emp1.printDetails();
        System.out.println("Specialization: "+emp1.specialization);
        System.out.println("Manager");
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter phone number");
        phoneNumber = sc.nextLine();
        phoneNumber = sc.nextLine();
        System.out.println("Enter address");
        address = sc.nextLine();
        System.out.println("Enter salary");
        salary = sc.nextInt();
        System.out.println("Enter department");
        String department = sc.nextLine();
        department = sc.nextLine();
        Manager m1 = new Manager(name,age,phoneNumber,address,salary,department);
        m1.printDetails();
        System.out.println("Department: "+m1.department);
        sc.close();
    }
}

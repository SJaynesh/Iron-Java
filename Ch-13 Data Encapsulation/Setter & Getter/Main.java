
import java.util.Scanner;

class Employee {

    // Attributes
    private int id;
    private String name;
    private int age;
    private double salary;

    // Setter
    public void setEmployeeData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter emp id : ");
        id = scanner.nextInt();
        System.out.print("Enter emp name : ");
        name = scanner.next();
        System.out.print("Enter emp age : ");
        age = scanner.nextInt();
        System.out.print("Enter emp salary : ");
        salary = scanner.nextDouble();
        System.out.println("\n");
    }

    // Getter
    public void getEmployeeData() {
        System.out.println("\n");
        System.out.println("ID\t: " + id);
        System.out.println("NAME\t: " + name);
        System.out.println("AGE\t: " + age);
        System.out.println("SALARY\t: " + salary);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Employee e1 = new Employee();
        // Employee e2 = new Employee();

        // e1.setEmployeeData();
        // e2.setEmployeeData();

        // e1.getEmployeeData();
        // e2.getEmployeeData();
        System.out.print("Enter number of employees : ");
        int size = scanner.nextInt();

        Employee[] employees = new Employee[size]; // [101, lalo, 21, 45 0] [102 A 20
        // 46] []

        for (int i = 0; i < size; i++) {
            employees[i] = new Employee();
            employees[i].setEmployeeData();
        }

        for (int i = 0; i < size; i++) {
            employees[i].getEmployeeData();
        }
    }
}
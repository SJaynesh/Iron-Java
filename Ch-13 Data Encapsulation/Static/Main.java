import java.util.Scanner;

class Students {
    private int rollNo;
    private String name;
    private double per;
    // Static Data Member
    private static String school = "ABC School";
    public static boolean isOn = true;

    public void setStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll no : ");
        this.rollNo = scanner.nextInt();
        System.out.print("Enter name : ");
        this.name = scanner.next();
        System.out.print("Enter per : ");
        this.per = scanner.nextDouble();
    }

    public void getStudent() {
        System.out.println("Roll No\t: " + this.rollNo);
        System.out.println("Name\t: " + this.name);
        System.out.println("Per\t: " + this.per);
        System.out.println("School\t: " + school);
    }

    // Static Method
    public static void getData() {
        System.out.println("School Name : " + school);
    }
}

public class Main {
    public static void main(String[] args) {
        Students[] s1 = new Students[2];

        for (int i = 0; i < 2; i++) {
            s1[i] = new Students();
            s1[i].setStudent();
        }

        for (int i = 0; i < 2; i++) {
            s1[i].getStudent();
        }

        Students.getData();
        System.out.println(Students.isOn);
    }
}

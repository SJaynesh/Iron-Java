
import java.util.Scanner;

class Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = scanner.nextInt();

        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade : A1");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade : A2");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade : B1");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade : B2");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade : C1");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade : C2");
        } else if (marks >= 33 && marks <= 40) {
            System.out.println("Grade : D");
        } else if (marks >= 0 && marks <= 32) {
            System.out.println("Failed...");
        } else {
            System.out.println("Invalid Marks...");
        }

    }
}

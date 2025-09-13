
import java.util.Scanner;

public class TNRS {
    // TNRS (Take Nothing and Return Something)
    int addition() {

        System.out.print("Enter first number : ");
        int a = inputInt(); // Nasted Function

        System.out.print("Enter second number : ");
        int b = inputInt();

        return a + b;
    }

    int inputInt() {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); // 21

        return n;
    }

    public static void main(String[] args) {
        TNRS t1 = new TNRS();

        System.out.println("Answer : " + t1.addition());

        int age;

        System.out.print("Enter your age : ");
        age = t1.inputInt();

        System.out.println("Age : " + age);
    }
}

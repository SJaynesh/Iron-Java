
import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        a = scanner.nextInt(); // 10

        System.out.print("Enter second number : ");
        b = scanner.nextInt(); // 20

        System.out.println("\n\nBefore Swap");
        System.out.println("A\t: " + a + "\nB\t: " + b);

        // Logic Swapping

        // Using Third Variable
        // int c = a; // c = 10
        // a = b;// a = 20
        // b = c;

        // Without Using Third Variable
        // a = a + b; // a = 10 + 20 = 30
        // b = a - b; // b = 30 - 20 = 10
        // a = a - b; // a = 30 - 10 = 20

        a = a * b; // 10 * 20 = 200 = a
        b = a / b; // 200 / 20 = 10 = b
        a = a / b; // 200 / 10 = 20 = a

        System.out.println("\n\nAfter Swap");
        System.out.println("A\t: " + a + "\nB\t: " + b);
    }
}

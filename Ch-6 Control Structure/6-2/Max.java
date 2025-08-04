
import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter second number : ");
        int b = scanner.nextInt();
        System.out.print("Enter third number : ");
        int c = scanner.nextInt();

        if (a == b && a == c && b == c) {
            System.out.println("All are equals..");
        } else if (a == b || a == c || b == c) {
            System.out.println("Both are equals...");
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println(a + " is Max..");
                } else {
                    System.out.println(c + " is Max..");
                }
            } else {
                if (b > c) {
                    System.out.println(b + " is Max..");
                } else {
                    System.out.println(c + " is Max..");
                }
            }
        }
    }
}

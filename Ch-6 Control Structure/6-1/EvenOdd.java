
import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = scanner.nextInt(); // 11

        if (num % 2 == 0) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }
    }
}

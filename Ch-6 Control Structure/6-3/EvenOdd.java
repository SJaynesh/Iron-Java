import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = scanner.nextInt(); // 25

        // String msg = (num % 2 == 0)
        // ? " is even"
        // : " is odd";

        // System.out.println(num + msg);

        System.out.println(num + ((num % 2 == 0) ? " is even" : " is odd"));
    }
}
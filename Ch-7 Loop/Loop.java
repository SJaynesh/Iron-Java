
import java.util.Scanner;

class Loop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = scanner.nextInt(); // 5

        int i = 1;
        int sum = 1;

        while (i <= n) {
            // System.out.print(i + "\t");
            sum = sum * i;
            // System.out.print(i + " + ");
            i++;
        }

        System.out.println("Factorial : " + sum);
    }
}

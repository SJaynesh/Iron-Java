
import java.util.Scanner;

class Loop2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = scanner.nextInt(); // 6

        // 6 * 1 = 6
        // 6 * 2 = 12
        // 6 * 3 = 18
        // 6 * 10 = 60
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + n * i);
            i++;
        }
    }
}

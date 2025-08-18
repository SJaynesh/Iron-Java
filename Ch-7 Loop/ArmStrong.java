
import java.util.Scanner;

class ArmStrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = scanner.nextInt();

        int sum = 0;
        int arm = n;

        while (n != 0) {
            // int rem = n % 10;
            sum += (n % 10) * (n % 10) * (n % 10);
            n = n / 10;
        }
        if (arm == sum) {
            System.out.println(arm + " is Aramstrong number");
        } else {
            System.out.println(arm + " is not Aramstrong number");
        }
    }
}

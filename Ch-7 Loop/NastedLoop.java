import java.util.Scanner;

class NastedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int start = scanner.nextInt(); // 5

        System.out.print("Enter end number : ");
        int end = scanner.nextInt(); // 10

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j); // 5 * 1 = 5
            }
            System.out.println();
        }

    }
}

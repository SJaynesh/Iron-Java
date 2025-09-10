
import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element : ");
                a[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int[] array : a) {
            for (int elem : array) {
                System.out.print(elem + " ");
                sum += elem;
            }
            System.out.println("");
        }

        System.out.println("Sum : " + sum);
    }
}
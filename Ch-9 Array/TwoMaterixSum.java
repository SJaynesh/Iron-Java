
import java.util.Scanner;

public class TwoMaterixSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = scanner.nextInt(); // 5
        System.out.print("Enter column : ");
        int col = scanner.nextInt(); // 3

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] sum = new int[row][col];

        System.out.println("\n\nInput Materix A\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter a[" + i + "][" + j + "] : "); // Enter a[0][0] : 10
                a[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }

        System.out.println("\n\nInput Materix B\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter b[" + i + "][" + j + "] : "); // Enter b[0][0] : 10
                b[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Sum Materix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

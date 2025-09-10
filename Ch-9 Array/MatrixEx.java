
import java.util.Scanner;

public class MatrixEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row :");
        int row = scanner.nextInt();
        System.out.print("Enter column :");
        int col = scanner.nextInt();

        int[][] a = new int[row][col];

        System.out.println("\n\nInput Materix A\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter a[" + i + "][" + j + "] : "); // Enter a[0][0] : 10
                a[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }

        System.out.println("\n\nDiagonal Elements\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        System.out.println("\n\nBoundary Elements\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        int rowSum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowSum += a[i][j];
            }
        }

        System.out.println("All Elements Sum : " + rowSum);
    }
}

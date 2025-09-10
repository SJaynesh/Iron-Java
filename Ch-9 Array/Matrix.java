
import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = scanner.nextInt();
        System.out.print("Enter column : ");
        int col = scanner.nextInt();

        int[][] a = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter array element : ");
                a[i][j] = scanner.nextInt();

            }
            System.out.println("");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

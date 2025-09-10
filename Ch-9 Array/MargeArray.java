
import java.util.Scanner;

public class MargeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first array size : ");
        int size1 = scanner.nextInt(); // 5
        System.out.print("Enter second array size : ");
        int size2 = scanner.nextInt(); // 3

        int[] a = new int[size1]; // a[5]
        int[] b = new int[size2]; // b[3]
        int[] marge = new int[size1 + size2];

        System.out.println("\n\nArray A Input\n");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter a[" + i + "] :");
            a[i] = scanner.nextInt();
        }

        System.out.println("\n\nArray B Input\n");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter b[" + i + "] :");
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < size1; i++) {
            marge[i] = a[i]; // marge[4] = a[4]
        }

        for (int i = 0; i < size2; i++) {
            marge[i + size1] = b[i]; // marge[2 + 5] = b[2]
        }

        System.out.println("\n\nMarge Array : ");
        for (int i = 0; i < size1 + size2; i++) {
            System.out.print(marge[i] + "\t");
        }
    }
}
/*
 * 
 * a[5] = 10 20 30 40 50
 * 0 1 2 3 4
 * 
 * b[3] = 60 70 80
 * 0 1 2
 * 
 * marge[8] = 10 20 30 40 50 60 70 80
 * 0 1 2 3 4 5 6 7
 */

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        /*
         * Dynamic Array
         * 1D Array :
         * - Datatype[] arrayName;
         * - Datatype arrayName[];
         * - Datatype[] arrayName = new Datatype[size];
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of element : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("\n\nArray Input\n");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a[" + i + "] : ");
            array[i] = scanner.nextInt(); // 25
        }

        System.out.println("\n\nArray Output\n");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}

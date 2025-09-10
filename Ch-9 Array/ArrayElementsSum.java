import java.util.Scanner;

public class ArrayElementsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of element : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        float sum = 0;

        System.out.println("\n\nArray Input\n");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " : "); // Enter element 1 :
            array[i] = scanner.nextInt();
        }

        System.out.println("\n\nArray Ouput\n");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
            sum = sum + array[i];
        }

        System.out.println("\n\nArray elements sum : " + sum);

        float avg = sum / size;
        System.out.println("\n\nAVG : " + avg);

    }
}

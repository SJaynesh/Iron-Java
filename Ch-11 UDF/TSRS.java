
import java.util.Scanner;

public class TSRS {
    // TSRS

    int multiplication(int a, int b) {
        return a * b;
    }

    int inputInt() {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); // 21

        return n;
    }

    int[] arrayInput(int size) {

        int[] a = new int[size];
        String[] names = new String[5];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            a[i] = inputInt(); // Nasted Function
        }

        return a;
    }

    void arrayOutput(int size, int[] a) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    public static void main(String[] args) {
        TSRS t1 = new TSRS();

        System.out.println("Answer : " + t1.multiplication(12, 5));

        int[] array = t1.arrayInput(5);

        t1.arrayOutput(5, array);

    }
}

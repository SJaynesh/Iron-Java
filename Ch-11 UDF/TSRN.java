
import java.util.Scanner;

public class TSRN {
    // TSRN (Take Something and Return Nothing)'
    void increment(int a) {
        System.out.println("Number\t: " + (++a));
    }

    void sum(int x, int y, int z, String name) {
        System.out.println(x + " + " + y + " + " + z + " = " + (x + y + z));
        System.out.println("Name\t: " + name);
    }

    void P(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        TSRN t1 = new TSRN();
        Scanner scanner = new Scanner(System.in);

        t1.increment(45); // argument

        int a, b, c;

        t1.P("Enter first number : ");
        a = scanner.nextInt();
        t1.P("Enter second number : ");
        b = scanner.nextInt();
        t1.P("Enter third number : ");
        c = scanner.nextInt();

        t1.sum(a, b, c, "Jaynesh Sarkar");
    }
}

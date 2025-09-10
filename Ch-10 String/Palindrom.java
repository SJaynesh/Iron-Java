
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("Enter any string : ");
        name = scanner.nextLine();
        // j a y
        // 0 1 2

        // System.out.println("Name : " + name);

        String rev = "";
        int len = name.length();

        name = name.toLowerCase();

        for (int i = len - 1; i >= 0; i--) {
            rev += name.charAt(i); // yaj
        }

        // System.out.println("Reverse : " + rev);

        // name.compareToIgnoreCase(rev) == 0
        if (name.contains(rev)) {
            System.out.println("String is palindrom");
        } else {
            System.out.println("String is not palindrom");
        }
    }
}

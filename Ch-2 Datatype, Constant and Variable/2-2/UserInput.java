import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = scanner.nextLine(); // String Input

        System.out.print("Enter first number : ");
        int a = scanner.nextInt(); // Int Input
        System.out.print("Enter second number : ");
        int b = scanner.nextInt(); // Int Input

        System.out.print("Enter PI value : ");
        final float PI = scanner.nextFloat();

        System.out.println("\n\nName\t: " + name);
        System.out.println("A\t: " + a);
        System.out.println("B\t: " + b);
        System.out.println("Sum\t: " + (a + b));
        System.out.println("PI\t: " + PI);

        scanner.close();

        // System.out.print("Enter age : ");
        // int age = scanner.nextInt(); // Int Input

        // System.out.println("\n\nAge\t: " + age);
    }
}

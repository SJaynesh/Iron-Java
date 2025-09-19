import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ClassName objName = new ClassName();
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.print("Enter your roll no : ");
        s1.rollNo = scanner.nextInt();
        System.out.print("Enter your name : ");
        s1.name = scanner.next();
        System.out.print("Enter your age : ");
        s1.age = scanner.nextInt();
        System.out.print("Enter your per : ");
        s1.per = scanner.nextDouble();

        System.out.println("\n\n");

        System.out.print("Enter your roll no : ");
        s2.rollNo = scanner.nextInt();
        System.out.print("Enter your name : ");
        s2.name = scanner.next();
        System.out.print("Enter your age : ");
        s2.age = scanner.nextInt();
        System.out.print("Enter your per : ");
        s2.per = scanner.nextDouble();

        System.out.println("\n\n");

        System.out.println("Roll No : " + s1.rollNo);
        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);
        System.out.println("Per : " + s1.per);

        System.out.println("\n");

        System.out.println("Roll No : " + s2.rollNo);
        System.out.println("Name : " + s2.name);
        System.out.println("Age : " + s2.age);
        System.out.println("Per : " + s2.per);
    }
}
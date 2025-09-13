public class Factorial {
    int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    void reverseNumber(int n) {
        if (n <= 1) {
            System.out.println("1");
        } else {
            System.out.println(n);
            reverseNumber(--n);
        }
    }

    public static void main(String[] args) {
        Factorial f1 = new Factorial();

        System.out.println("Factorial : " + f1.fact(5));

        f1.reverseNumber(10);
    }
}

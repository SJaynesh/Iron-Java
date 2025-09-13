public class Recursion {
    void loop(int start, int end) {
        if (start <= end) { // 11 <= 10
            System.out.println(start); // 1 2 3 4 .. 8 9 10

            start++; // 11

            loop(start, end); // 11 , 10
        }
    }

    public static void main(String[] args) {
        Recursion r1 = new Recursion();

        r1.loop(1, 10);
    }
}

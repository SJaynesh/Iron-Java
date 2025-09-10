
class OneDArray {
    public static void main(String[] args) {
        // 1D Array : datatype [] arrayName;

        // Static Array

        int[] marks = { 45, 89, 96, 12, 02 };

        // marks[0] = 78;
        // marks[1] = 89;
        // marks[2] = 96;
        // marks[3] = 12;
        // marks[4] = 02;

        System.out.println("Array Length : " + marks.length);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "\t");
        }
    }
}
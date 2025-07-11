class Variable {
    public static void main(String[] args) {
        // Syntax : Datatype variable_name;

        int a = 10, b = 5;
        // int b = 5;
        char ch = 'A';
        float PI = 3.14f;
        double marks = 89.63;
        boolean isOn = false;
        String name = "Jaynesh";

        byte x = 100;
        short y = 12000;

        b = 7;
        isOn = true;

        System.out.println("A\t: " + a);
        System.out.println("B\t: " + b); // 7
        System.out.println("Char\t: " + ch); // A
        System.out.println("PI\t: " + PI); // 3.14
        System.out.println("Marks\t: " + marks); // 89.63
        System.out.println("IsOn\t: " + isOn); // false
        System.out.println("Name\t: " + name); // Jaynesh
        System.out.println("Byte\t: " + x); // 100
        System.out.println("Short\t: " + y); // 12000
    }
}
public class StringBuiltInFun {
    public static void main(String[] args) {
        String name = "Jaynesh Sarkar";

        System.out.println("Name\t: " + name);
        System.out.println("Length\t: " + name.length()); // 14
        System.out.println("Char At\t: " + name.charAt(0)); // J
        System.out.println("UpperCase : " + name.toUpperCase()); // JAYNESH SARKAR
        System.out.println("LowerCase : " + name.toLowerCase()); // jaynesh sarkar
        System.out.println("Trim : " + name.trim()); // jaynesh sarkar
        System.out.println("Sub String : " + name.substring(0, 11)); // Jaynesh Sar
        System.out.println("Contain : " + name.contains("Sarkar")); // true
        System.out.println("Equal: " + name.equals("Sarkar")); // false
        System.out.println("Equal Ignore Case: " + name.equalsIgnoreCase("jaynesh Sarkar")); // true
        // System.out.println("Replace: " + name.replace('a', 'j')); // jjynesh Sjrkjr
        System.out.println("Index Of : " + name.indexOf('a')); // J
        System.out.println("Last Index Of : " + name.lastIndexOf('J')); // J

        String[] allNames = name.split("a"); // ["Jaynesh", "Sarkar", "Programming"]

        for (String value : allNames) {
            System.out.println(value);
        }

        // int[] a = { 10, 20, 30, 40, 50 };
        // var PI = 89.23;
        // for (int element : a) {
        // System.out.println(element);
        // }

        int number = 456321;

        String strNumber = String.valueOf(number);

        System.out.println("String :" + strNumber);

    }
}

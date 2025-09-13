public class CLA {
    public static void main(String[] args) {

        if (args.length != 0) {
            int sum = 0;
            System.out.println("Command Line Argument Length : " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
                sum += Integer.parseInt(args[i]);
            }

            System.out.println("Sum : " + sum);
        } else {
            System.out.println("Please enter argument using command line");
        }
    }
}


import java.util.Scanner;

class Hotel {

    public static void main(String[] args) {
        System.out.println("\nWelcome My Hotel\n");

        System.out.println("Press 1 for Panjabi");
        System.out.println("Press 2 for Gujarati");
        System.out.println("Press 3 for South Indian");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\n\n|--------------|");
                System.out.println("| PANJABI MENU |");
                System.out.println("|--------------|\n\n");

                System.out.println("Press 1 for Kaju Kari");
                System.out.println("Press 2 for Kaju Teeka");
                System.out.println("Press 3 for Kaju Bhurji");
                int menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("\n\n");
                        System.out.println("Your order is KAJU KARI");
                        break;
                    case 2:
                        System.out.println("\n\n");
                        System.out.println("Your order is KAJU TEEKA");
                        break;
                    case 3:
                        System.out.println("\n\n");
                        System.out.println("Your order is KAJU BHURJI");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }

                break;
            case 2:
                System.out.println("|---------------|");
                System.out.println("| GUJARATI MENU |");
                System.out.println("|---------------|");
                break;
            case 3:
                System.out.println("|-------------------|");
                System.out.println("| SOUTH INDIAN MENU |");
                System.out.println("|-------------------|");
                break;
            default:
                System.out.println("|-------------------|");
                System.out.println("| Invalice Choice   |");
                System.out.println("|-------------------|");
        }
    }
}

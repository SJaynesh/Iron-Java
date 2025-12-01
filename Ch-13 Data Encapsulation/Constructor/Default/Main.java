import java.util.Scanner;

class City {
    private String name;
    private int pincode;

    public City() {
        System.out.println("Welcome My City");
    }

    public City(String name, int pincode) {
        this.name = name;
        this.pincode = pincode;
    }

    // Getter
    public void getCityData() {
        System.out.println("City Name\t: " + this.name);
        System.out.println("City Pincode\t: " + this.pincode);
    }
}

public class Main {
    public static void main(String[] args) {
        String city;
        int pin;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your city name : ");
        city = scanner.next();
        System.out.print("Enter your city pincode : ");
        pin = scanner.nextInt();

        City c1 = new City(city, pin);

        System.out.print("Enter your city name : ");
        city = scanner.next();
        System.out.print("Enter your city pincode : ");
        pin = scanner.nextInt();

        City c2 = new City(city, pin);

        c1.getCityData();
        c2.getCityData();
    }
}

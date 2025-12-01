
class Car {
    // Attributes
    private int id;
    private String name;
    private String color;
    private String model;
    private String price;

    // Setter
    void setCarData(int id, String name, String color, String model, String price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.model = model;
        this.price = price;

        this.getCarData();
    }

    // Getter
    void getCarData() {
        System.out.println("Car ID\t\t: " + this.id);
        System.out.println("Car NAME\t: " + this.name);
        System.out.println("Car COLOR\t: " + this.color);
        System.out.println("Car MODEL\t: " + this.model);
        System.out.println("Car PRICE\t: " + this.price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setCarData(10101, "BMW", "Black", "M2", "45CR");

    }
}

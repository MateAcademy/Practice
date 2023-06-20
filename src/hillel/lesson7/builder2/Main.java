package hillel.lesson7.builder2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().maxSpeed(500).name("test").color("red").build();
    }
}

package generics.ex01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        driveAllTransport(transports);
        driveAllTransport(cars);

        Transport tr = new Transport();
        Car car = new Car();

        test(car);
    }

    public static void driveAllTransport(List<? extends Transport> transports) {
        for(Transport transport : transports) {
            transport.drive();
        }
    }


    public static void test(Transport transport) {
        transport.drive();
    }

}

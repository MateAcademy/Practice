package javaIoNio.serializable;

import javaIoNio.serializable.model.Car;
import javaIoNio.serializable.model.Engine;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car( 1,"BMW", "READ", new Engine(566, "max-bmw-i8"));
        Car car2 = new Car( 500,"BMW2", "BLUE", new Engine(400, "middle-bmw-i4"));

        String path = "src/io/serializable/db/db.txt";
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path))) {
            os.writeObject(car);
            os.writeObject(car2);
            os.flush();

        } catch (Exception e) {
            System.out.println(e);
        }



    }
}


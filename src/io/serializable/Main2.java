package io.serializable;

import io.serializable.model.Car;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Serhii Klunniy
 */
public class Main2 {
    public static void main(String[] args) {
        String path = "src/io/serializable/db/db.txt";
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream(path))) {
            Car car3 = (Car) oi.readObject();
            Car car4 = (Car) oi.readObject();
            System.out.println(car3);
            System.out.println(car4);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

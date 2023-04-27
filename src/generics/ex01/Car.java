package generics.ex01;

import java.sql.SQLOutput;

/**
 * @author Serhii Klunniy
 */
public class Car extends Transport {
    @Override
    public void drive() {
        System.out.println("Car");
    }
}

package hillel.lesson5.instanceOf_ex;

/**
 * @author Serhii Klunniy
 */
public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat eat");
    }

    void sayHello() {
        System.out.println("test say hello");
    }
}

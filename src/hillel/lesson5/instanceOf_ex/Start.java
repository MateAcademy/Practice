package hillel.lesson5.instanceOf_ex;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = {cat, dog};

        for (Animal animal : animals) {
            if (animal instanceof Cat cat1) {
                ((Cat) animal).sayHello();

                cat1.eat();
            }

            animal.eat();
        }

    }
}

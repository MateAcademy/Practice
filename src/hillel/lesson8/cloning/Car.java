package hillel.lesson8.cloning;

/**
 * @author Serhii Klunniy
 */
public class Car implements Cloneable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}

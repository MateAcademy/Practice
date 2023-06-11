package hillel.lesson4;

/**
 * @author Serhii Klunniy
 */
public class Car {


    {
       int a= 5;
    }

    private int id;
    private String name;
    private String color;

    public Car(String name, String color) {
        super();
    }

    public Car() {
    }

    public Car(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("bmw", "red");
        System.out.println(car);

        {
            int b = 7;
            //....
        }



    }
}



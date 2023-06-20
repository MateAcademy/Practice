package hillel.lesson5;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human(33, "Herman");
        Human human2 = new Human(30, "Andrey");

        String name = null;
        String a = "hello";

        Student student = new Student();
        Car car = new Car();
        Bmw bmw = new Bmw();

        if(student instanceof Human) {
        }

        if (null instanceof Human) {

        }


        System.out.println(null instanceof Student);


    }
}

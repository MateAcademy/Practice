package hillel.lesson8.cloning;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {

        Student student1 = new Student("Tom", 20, new Car("audi"));
        try {
            Student student2 = (Student) student1.clone(); // audi

            student1.getCar().setName("bmw");

            System.out.println(student2);  //Tom 20 bmw

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

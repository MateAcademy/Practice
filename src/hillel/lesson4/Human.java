package hillel.lesson4;

/**
 * @author Serhii Klunniy
 */
public class Human {
    private int age;
    private String name;

    public Human() {
        System.out.println("мы в конструкторе Human");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getControlSum() {
        return (age * (name.length() - 2));
    }
}

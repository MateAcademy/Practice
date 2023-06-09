package hillel.lesson3;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.age = 25;
        human.name = "Hillel";
        // в чем тут проблема? Почему так лучше не делать? Поля могут остаться не заполненными, нет никакой горантии что поля проставит,
        // есть такая штука про персистентное создание обьектов, что бы они были полноценными, у любого человека должны быть ...
        // либо человек есть и он полноценнен или его нет вовсе
    }

    public static double sum(int a, boolean b) {
        int x = 5;
        return x;
    }
}


class Human {
    String name;
    int age;
    String address;
    // нам заранее не известно что то и оно может быть необязательным, все констр должны быть как минимум с обязательными полями
    // дальше давайте создадим какой-нибудь метод:

    void sayHello() {
        System.out.println("Привет, я человек!");
    }
}

class Student {
    String name;
    int age;
    String address;
    double avgMark;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address, double avgMark) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.avgMark = avgMark;
    }

    //как мы видем какаято часть кода дублируется, нужно наследоваться.
    //мы создаем студента а фактически можно пользоваться как человеком
}
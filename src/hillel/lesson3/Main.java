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
}


class  Human {
    String name;
    int age;
//    String address;
    // нам заранее не известно что то и оно может быть необязательным, все констр должны быть как минимум с обязательными полями
    // дальше давайте создадим какой-нибудь метод:

    void sayHello() {
        System.out.println("Привет, я человек!");
    }
}

//мі решили создать сущность студента, какая то часть кода задублинована
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

    void test() {
        address = "test";
        age = 25;
        avgMark = 4.5;
    }

    //как мы видем какая то часть кода дублируется, нужно наследоваться.
    //мы создаем студента а фактически мо жно пользоваться как человеком
    //мы можем оперировать студентом как человеком
    //если мы считаем что человек невозможен, может быть илии студент илии учитель мы делаем класс абстрактным, это означает что обьекты этого класса создать нельзя)
    //Это нужно для того чтобы никто не мог создать обьект класса хьюман если вы считаете что хьюман неполноценная сущность
}
package hillel_shaytan.lesson23;

//это класскоторый содержит себя же
//каждый элемент енама это уже созданный обьект
//не содержит в себе состояний.
//переопределять   toString()
//никаких геттеров, сеттеров
//енам не содержит в себе изменяемых состояний
//методы не стоит писать
//порт это какое-то значение которое привязано к какому то приложению 80 - http, 8080, порты могут использоваться приложением, открываться/закрываться
//протокол - это совокупность правил по которым кто-то должен общаться с кем-то, что бы две машины могли между собой общаться и что бы они понимали что происходит
//адрес айпишник и порт(дорога) , протокол - на какой машине
public enum Color {
    RED("this is read"), GREEN("this is green"), YELLOW("yellow");

    public final String name;

//    Color() {
//        name = "red";
//    }

    Color(String name) {
        this.name = name;
    }

    public String greetings(String name) {
        return "hello " + name;}

//    @Override
//    public String toString() {
//        return "Color{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return this.name;
    }
}

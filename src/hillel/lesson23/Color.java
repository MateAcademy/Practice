package hillel.lesson23;

//это класскоторый содержит себя же
//каждый элемент енама это уже созданный обьект
//не содержит в себе состояний.
//переопределять   toString()
//никаких геттеров, сеттеров
//енам не содержит в себе изменяемых состояний
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

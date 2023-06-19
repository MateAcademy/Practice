package hillel.lesson23;

//это класскоторый содержит себя же
//каждый элемент енама это уже созданный обьект
public enum Color {
    RED, GREEN("this is green"), YELLOW("yellow");

    public String name;

    Color() {
        name = "red";
    }

    Color(String name) {
        this.name = name;
    }

    public String greetings(String name) {
        return "hello " + name;}
}

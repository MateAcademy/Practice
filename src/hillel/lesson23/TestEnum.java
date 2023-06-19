package hillel.lesson23;

public class TestEnum {
    public static void main(String[] args) {
        //System.out.println("hello");

        Color color = Color.RED;
        String ver = color.name;
        System.out.println(ver);

        switch (color) {
            case RED -> System.out.println(color.name);
            case GREEN -> System.out.println(color.name);
            case YELLOW -> System.out.println(color.name);
            default -> System.out.println("default");
        }

        System.out.println(Color.GREEN.greetings("name"));

    }
}

package hillel_shaytan.lesson23;

public class TestEnum {
    public static void main(String[] args) {
        //System.out.println("hello");

        Color color = Color.RED;
        //name
        //toString()
        //compareTo()
        //hashCode()
        //getClass()
        //ordinal
        String ver = color.name;
//        System.out.println(ver);

        switch (color) {
            case RED -> System.out.println(color.name);
            case GREEN -> System.out.println(color.name);
            case YELLOW -> System.out.println(color.name);
            default -> System.out.println("default");
        }

        String alex = Color.GREEN.greetings("Alex");
        System.out.println(alex);

        System.out.println(Color.GREEN);

//        Color.GREEN.name = "black";

        System.out.println(Color.GREEN);
    }
}

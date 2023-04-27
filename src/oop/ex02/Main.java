package oop.ex02;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.class.getClass().isSynthetic());

        String str = "package oop.ex02;\n" +
                "\n" +
                "/**\n" +
                " * @author Serhii Klunniy\n" +
                " */\n" +
                "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(Main.class.getClass().isSynthetic());\n" +
                "        \n" +
                "        \n" +
                "    }\n" +
                "    \n" +
                "    private void test () {\n" +
                "        // ...\n" +
                "    }\n" +
                "}\n";

    }

    private void test () {
        // ...
    }
}

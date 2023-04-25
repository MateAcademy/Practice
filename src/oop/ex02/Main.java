package oop.ex02;

public class Main {
    public static void main(String[] args) {
        String str = "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "       Main.class.isSynthetic()\n" +
                "        //        Main.class.isNestmateOf();\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "  private void test() {\n" +
                "        //...\n" +
                "  }\n" +
                "}\n";

       Main.class.isSynthetic();
        //        Main.class.isNestmateOf();
    }


  private void test() {
        //...
  }
}

package hillel.lesson4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {

        Student student = new Student(20 , "Kirill");


        Human human = new Human(33, "Герман");
        Human human2 = new Human(25, "Андрей");

        test();

        int resultHuman = human.getControlSum();
        int resultHuman2 = human2.getControlSum();
        String result = resultHuman + " второй результат " + resultHuman2;
        System.out.println(result);
    }

    private static void test() {
        for (int i = 0; i < 10000; i++) {
            String name = "";
            int k = 5;
            System.out.println("Hillel");
        }
    }
}

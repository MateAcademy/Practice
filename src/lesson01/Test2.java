package lesson01;

/**
 * @author Serhii Klunniy
 */
public class Test2 {
    public static void main(String[] args) {
        int val = 5;
        val = val+ val++;
        System.out.println(val);


        String alex = "Alex";
        String alex2 = new String("Alex").intern();

        System.out.println(alex == alex2);
    }
}

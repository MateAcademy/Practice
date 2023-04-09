package lesson02;

import java.util.Date;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date(5);
        Date now = new Date(4);

        System.out.println(date.after(now));

    }
}

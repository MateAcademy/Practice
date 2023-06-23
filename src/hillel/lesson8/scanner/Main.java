package hillel.lesson8.scanner;

import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        String next3 = scanner.next();
        String next4 = scanner.nextLine();
        int next = scanner.nextInt();
        int next2 = scanner.nextInt();

        System.out.println(next3);
        System.out.println(next4);
        System.out.println(next);
        System.out.println(next2);

//        String next3 = scanner.nextLine();


//        System.out.println("\n" + next);
//        System.out.println(next2);
//        System.out.println(next3);
//        System.out.println(next1);
    }
}

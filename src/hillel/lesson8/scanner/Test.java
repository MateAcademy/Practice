package hillel.lesson8.scanner;

import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
    }
}

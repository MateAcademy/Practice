package javaIoNio.io;

import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String str = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.nextLine();

        System.out.println("i= " + i);
        System.out.println("f= " + f);
        System.out.println( str);
        System.out.println( str2);
        System.out.println( str3);
    }
}

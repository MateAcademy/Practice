package javaIoNio.io.ex14;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Serhii Klunniy
 * Formatter - allows you to write to a file and at the same time format the text
 */
public class Start2 {
    public static void main(String[] args) {
        String path = "src/javaIoNio/io/ex14/file1.txt";
        String path2 = "src/javaIoNio/io/ex14/file2.txt";
        try {
            Formatter formatter = new Formatter(path2);
            Scanner sc = new Scanner(System.in);
            int i = 0;
            while (i < 3) {
                System.out.println("Please enter clientId, clientName, client surName, account balance ");
                formatter.format("%d %s %s %.2f\n", sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
                formatter.flush();
                i++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

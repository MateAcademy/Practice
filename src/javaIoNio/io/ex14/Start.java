package javaIoNio.io.ex14;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        String path = "src/javaIoNio/io/ex14/file1.txt";
        String path2 = "src/javaIoNio/io/ex14/file2.txt";
        try (FileInputStream fi = new FileInputStream(path);
             FileOutputStream fo = new FileOutputStream(path2)) {
            int c;
            while ( (c = fi.read()) != -1) {
                fo.write(c);
                fo.flush();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

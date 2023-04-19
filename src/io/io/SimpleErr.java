package io.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author Serhii Klunniy
 */
public class SimpleErr {
    public static void main(String[] args) {
        System.err.write(98);

        try {
            InputStream io = new FileInputStream("D:");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.err.println("File opening failed");
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

    }
}

package io.io.ex05;

import java.io.File;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("src/lesson03/ex05/file.txt");
        file.deleteOnExit();
    }
}

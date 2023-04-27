package io.nio.ex06;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // System.out.println(Arrays.toString(new char[5]));    //'\u0000'
        readFileWithBuffer();
    }

    private static void readFileWithBuffer() {
        try (FileReader reader = new FileReader("/home/user/dev/Practice/src/io/nio/ex06/test.txt")) {
            char[] buf = new char[10];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 10) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package io.io.ex09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 56, 77, 1};
            OutputStream os = new FileOutputStream("text.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]);
            }
            os.flush();
            os.close();

            InputStream is = new FileInputStream("text.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print(is.read() + " ");
//                System.out.print((char) is.read() + " ");
            }
            is.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

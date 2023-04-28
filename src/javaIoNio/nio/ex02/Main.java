package javaIoNio.nio.ex02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path2 = "src/io/nio/ex02/test2.txt";
        String path3 = "src/io/nio/ex02/test3.txt";
        String path4 = "src/io/nio/ex02/test4.txt";

        try (OutputStream os = new BufferedOutputStream(new FileOutputStream(path4));
             FileWriter fw = new FileWriter(path2);
             PrintWriter pw = new PrintWriter(path3);
             ){

            byte [] str = "Hello".getBytes();
            os.write(str);
            os.flush();

            fw.write("Hello");
            fw.flush();

            pw.write("Hello");
            pw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

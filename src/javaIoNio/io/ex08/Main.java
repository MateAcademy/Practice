package javaIoNio.io.ex08;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/user/dev/Practice/src/io/io/ex08/file.txt")));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/user/dev/Practice/src/io/io/ex08/file2.txt"), "Cp866"))) {
            int c;
            while ((c = br.read()) != -1) {
                bw.write((char) c);
            }

            bw.flush();

            System.out.println("The jobs finished");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

package javaIoNio.io.ex10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);

            String s = "Hello world";
            System.out.println("System.out puts: " + s);
            pw.println("PrintWriter puts: " + s);

            char c;
            pw.println("Посимвольный ввод:");
            while ((c = (char) br.read()) != 'q') {
                pw.println(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

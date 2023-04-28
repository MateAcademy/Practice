package javaIoNio.io.ex07;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true)) {
            File f = new File("/home/user/dev/Practice/src/io/io/ex07/text12.txt");

            pw.println("File \"" + f.getName() + "\"" + (f.exists() ? "" : " no ") + " exist");
            pw.println("You " + (f.canRead() ? "can" : "no") + " read");
            pw.println("You " + (f.canWrite() ? "can" : "no") + " write");
            pw.println("Length file " + f.length() + " byte");
            pw.println();

            File file = new File("/home/user/dev/Practice/src/io/io/ex07");
            pw.println("directory contents:");
            if (file.exists() && file.isDirectory()) {
                String[] s = file.list();
                for (int i = 0; i < s.length; i++) {
                    pw.println(s[i]);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

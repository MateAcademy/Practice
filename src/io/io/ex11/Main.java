package io.io.ex11;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File f1 = new File("/home/user/dev/Practice/src/io/io/ex11/file.txt");

        BufferedReader br = new BufferedReader(new FileReader(f1));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }

        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
        pw.println("Good Luck");
        pw.flush();
        pw.close();
    }
}

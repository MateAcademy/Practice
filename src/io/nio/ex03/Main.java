package io.nio.ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

//      System.in. => byte
//      new InputStreamReader => Symbols
//      ew BufferedReader => String, text                 Scanner - 1024, BufferedReader - 8192


//        System.out.println(System.in.read()); // 100 - 49
//        System.out.println();

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String str = bufferedReader.readLine();
//        System.out.println(str);
//        bufferedReader.close();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int i2 = inputStreamReader.read();
        System.out.println(i2);
        System.out.println((char) i2);

    }
}

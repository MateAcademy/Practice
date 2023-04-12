package lesson03.ex00;

import java.io.*;
import java.util.Arrays;

/**
 * @author Serhii Klunniy
 * String str = hello漢字;
 */
public class Main {
    public static void main(String[] args) {
//        FileInputStream fileInputStream;
//
//        try {
//            fileInputStream = new FileInputStream("src/lesson03/ex00/file.txt");
//            int a;
//            while ((a = fileInputStream.read()) != -1) {
//                System.out.println((char) a);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        FileOutputStream fileOutputStream;
//
//        try {
//            String str = "\n Hello world";
//
//            fileOutputStream = new FileOutputStream("src/lesson03/ex00/file.txt", true);
//            fileOutputStream.write( str.getBytes());
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            FileReader fileReader = new FileReader("src/lesson03/ex00/file.txt");
//            char[] ints = new char[30];
//            fileReader.read(ints);
//
//            System.out.println(ints);
//            //System.out.println(Arrays.toString(ints));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("src/lesson03/ex00/file.txt");

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        printWriter.write("print writer is here");
        printWriter.flush();

    }
}

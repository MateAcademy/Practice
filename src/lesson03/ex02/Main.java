package lesson03.ex02;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Вывод списка файлов. HTML в каталоге
 */
public class Main {
    public static void main(String[] args) {
        list();
        //listFiles();
    }

    //return a list of strings as an array
    private static void list() {
        String dirname = "src/io/ex01/controller";
        File fl = new File(dirname);

        FilenameFilter only = new OnlyExt("html");

        String[] s = fl.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    //return a list of files as an array
    private static void listFiles() {
        String dirname = "src/io/ex01/controller";
        File fl = new File(dirname);

        FilenameFilter only = new OnlyExt("html");

        File[] s = fl.listFiles(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}

package io.io.ex03;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        //I want to take files that consist entirely of capital letters
//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().equals(pathname.getName().toUpperCase());
//            }
//        };


        list();
        //listFiles();
    }

    //return a list of strings as an array
    private static void list() {
        String dirname = "src/lesson03/ex02/controller";
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

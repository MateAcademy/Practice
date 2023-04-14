package lesson03.ex01;

import java.io.*;

/**
 * @author Serhii Klunniy
 * String str = hello漢字;
 */
public class Main {
    public static void main(String[] args) {
//        FileInputStream fileInputStream;
//
//        try {
//            fileInputStream = new FileInputStream("src/lesson03/ex01/file.txt");
//            int a;
//            while ((a = fileInputStream.read()) != -1) {
//                System.out.print((char) a);
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
//            fileOutputStream.write(str.getBytes());
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            FileReader fileReader = new FileReader("src/lesson03/ex01/file.txt");
//            char[] ints = new char[31];
//            fileReader.read(ints);
//
//            System.out.println(ints);
//            //System.out.println(Arrays.toString(ints));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        File file = new File("src/lesson03/ex00/file.txt");
//
//        PrintWriter printWriter = null;
//        try {
//            printWriter = new PrintWriter(file);
//            printWriter.write("print writer is here");
//            printWriter.flush();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        String separator = File.separator;
        
        try {
            var pathToFile = new File("src/lesson03/ex01/file.txt");
            var filreader = new FileReader(pathToFile);
            var bufferedReader = new BufferedReader(filreader);

            //call the method multiple times
            bufferedReader.lines().forEach(System.out::println);
            bufferedReader.lines().forEach(System.out::println);
            bufferedReader.lines().forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e);
        }

//        File file = new File("");
//
//        String pathSeparator = File.pathSeparator;  //   ;   string
//        char pathSeparator2 = File.separatorChar;   //    ;     char
//        String separator = File.separator;          //    /
//        char pathSeparatorChar = File.pathSeparatorChar;
//
//        //it allows you to get a set of root directories
//        File[] files1 = File.listRoots();
//
//        System.out.println(pathSeparatorChar);
//
//creating temporary files
//        try {
//            File tempFile = File.createTempFile("_pref", "_suff");  //pref_tmp_index_suff
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//getting lists of files in a directory
        File file = new File("path_to_dir");
        File file3 = new File("src/lesson03/ex01/file.txt");
//        File[] files = file.listFiles();

        //get parent folder:
        String parent = file3.getParent();
        File parentFile = file3.getParentFile();
        System.out.println(parent);  //src\lesson03\ex01



    }
}

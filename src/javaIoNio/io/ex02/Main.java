package javaIoNio.io.ex02;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {

        FileFilter fileFilter = new PictureFilter("jpeg", "gif");

        Path path = Path.of("src/io/io/ex02/files");
        File file = new File(path.toString());

        if (file.isDirectory()) {
            System.out.println("Directory: " + file.getName());

            File[] list = file.listFiles(fileFilter);
            File[] list2 = file.listFiles();
            System.out.println(Arrays.stream(list2).filter(fileFilter::accept).collect(Collectors.toList()));

            for (int i = 0; i < list.length; i++) {
                File file1 = new File(file + "/" + list[i]);
                if (file1.isDirectory()) {
                    System.out.println(list[i] + " is a directory");
                } else {
                    System.out.println(list[i] + " is a file");
                }
            }

        }

    }
}

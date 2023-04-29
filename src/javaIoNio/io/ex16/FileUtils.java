package javaIoNio.io.ex16;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @author Serhii Klunniy
 */
public class FileUtils {

    public void printIOFileDetails(String path) throws IOException {
        File file = new File(path);

//get path details
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Relative path: " + file.getPath());
        //мы получаем значение в байтах, для того что бы получить в мегабайтах / 1000000
        System.out.println("Free space in MBytes: " + file.getFreeSpace() / 1000000);
        System.out.println("Parent directory " + file.getParent());
        System.out.println("Is absolute path " + file.isAbsolute());

        System.out.println("Current directory is: " + System.getProperty("user.dir"));

        if (file.isDirectory()) {
            System.out.println("It is a directory. Printing content:");
            String[] list = file.list();
            if (list != null) {
                for (String el : list) {
                    System.out.println(el);
                }
            }
        } else {
            System.out.println("It is a file");
            System.out.println("Create a new file" + file.createNewFile());
            //Permissions
            System.out.println("Can read - " + file.canRead());
            System.out.println("Can write - " + file.canWrite());
            System.out.println("Can execute - " + file.canExecute());
            System.out.println("File is hidden - " + file.isHidden());
            System.out.println("Last modified - " + file.lastModified());
            System.out.println("Deleting file - " + file.delete());

            Path filePath = file.toPath();

            FileInputStream fi = new FileInputStream(file);
            BufferedInputStream bf = new BufferedInputStream(fi);
        }
    }
}

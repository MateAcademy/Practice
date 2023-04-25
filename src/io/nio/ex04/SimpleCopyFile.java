package io.nio.ex04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleCopyFile {
    public static void main(String[] args) {
        File sourceFile = new File("/home/user/dev/Practice/src/io/nio/ex04/file1.txt");
        File targetFile = new File("/home/user/dev/Practice/src/io/nio/ex04/file2.txt");

        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath());
            Files.move(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package javaIoNio.nio.ex09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        try {
            readFileInFull("/home/user/dev/Practice/src/javaIoNio/nio/ex09/text.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //маленький файл таким образом прочитать можно
    private static void readFileInFull(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> lines = Files.readAllLines(path);
        for (String string : lines) {
            System.out.println(string);
        }
    }

}

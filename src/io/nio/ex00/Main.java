package io.nio.ex00;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String pathToFile = "src/io/nio/ex00/book.txt";
        Path path1 = Path.of(pathToFile);

        System.out.println(Files.readAllLines(path1));

    }
}

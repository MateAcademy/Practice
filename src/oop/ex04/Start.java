package oop.ex04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("");
        // no
        System.out.println("File exists " + !Files.exists(path));
        System.out.println("File dose note exists " + Files.notExists(path));

        Path absolutePath = path.toAbsolutePath();

        Path parentPats = absolutePath.getParent();
        Path filePath = parentPats.resolve("...");
        if(Files.notExists(filePath)) {
            Files.createDirectory(filePath);
        }
    }
}

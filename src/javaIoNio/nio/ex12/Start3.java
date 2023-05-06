package javaIoNio.nio.ex12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Serhii Klunniy
 */
public class Start3 {
    public static void main(String[] args) {
        doSomething();
    }

    private static void doSomething() {
        Path dir = Paths.get("temp");
        try {
            if (Files.notExists(dir)) {
                Files.createDirectory(dir);
            }

            Files.createDirectories(Paths.get("temp/a/b/c"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

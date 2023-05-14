package javaIoNio.nio.ex14;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/javaIoNio/nio/ex14");

        int nameCount = path.getNameCount(); // 4

        System.out.println(nameCount);
        System.out.println(path.subpath(nameCount-1, nameCount));

    }
}

package javaIoNio.nio.ex14;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Serhii Klunniy
 * FileVisitor
 * SimpleFileVisitor
 */
public class FileTreeVisitor {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\projectsJAVA\\Practice\\src\\javaIoNio\\nio\\ex14");
        Files.walkFileTree(path, new Visitor());
    }

    //ctrl + O
    public static class Visitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            System.out.println(file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println(dir);
            return FileVisitResult.CONTINUE;
        }
    }
}

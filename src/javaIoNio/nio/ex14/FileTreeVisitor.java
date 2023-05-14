package javaIoNio.nio.ex14;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
            renameFile(file);
            return FileVisitResult.CONTINUE;
        }

        private void renameFile(Path file) throws IOException {
            int nameCount = file.getNameCount();
            if (nameCount > 1) {
                System.out.println(file);
                Path startPath = file.subpath(0, nameCount - 1);
                Path endPath = file.subpath(nameCount - 1, nameCount);
                Files.move(file, Paths.get(startPath + File.separator + LocalDate.now().format(DateTimeFormatter.ISO_DATE) + "_" + endPath));
            }
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println(dir);
            renameFile(dir);
            return FileVisitResult.CONTINUE;
        }
    }
}

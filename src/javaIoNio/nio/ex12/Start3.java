package javaIoNio.nio.ex12;

import java.io.IOException;
import java.nio.file.*;

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

            Files.createTempDirectory(dir, "tmp_");

//            Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();
//            for (Path rootDir : rootDirectories) {
//                System.out.println(rootDir);
//            }

            DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
                @Override
                public boolean accept(Path entry) throws IOException {
                    return Files.isDirectory(entry);
                }
            };

           try(DirectoryStream<Path> paths = Files.newDirectoryStream(dir, "*.{txt, bin}")) {
               for (Path rootDir : paths) {
                   System.out.println(rootDir);
               }
           }

            System.out.println(Files.isDirectory(Paths.get("D:\\projectsJAVA\\Practice\\temp\\temp")));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

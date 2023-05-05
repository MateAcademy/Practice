package javaIoNio.nio.ex07;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) throws IOException, InterruptedException {
        //printNioFileDetails("src/javaIoNio/nio/ex07/test/test.txt");
        // readFileInfo("src/javaIoNio/nio/ex07/task.txt"); //StreamReader
        nioReadFileWithBuffer("src/javaIoNio/nio/ex07/task.txt");
       // nioWriteWithBuffer("src/javaIoNio/nio/ex07/task2.txt");
        //nioWriteWithStream("src/javaIoNio/nio/ex07/task2.txt");
       // nioReadWithStream("src/javaIoNio/nio/ex07/task2.txt");
    }

    private static void printNioFileDetails(String fileName) throws IOException, InterruptedException {
        Path path = Path.of(fileName);
        Path fileName2 = path.getFileName();
        Path path2 = Paths.get(fileName);
//        Path path3 = FileSystems.getDefault().getPath(fileName);
//        Path path4 = Paths.get(System.getProperty("user.dir", fileName));
//        Path path5 = new File("").toPath();

//        FileSystem fileSystem = path.getFileSystem();
//        Iterable<Path> rootDirectories = fileSystem.getRootDirectories();
//
//        System.out.println("File name " + path.getFileName());
        Path absolutePath = path.toAbsolutePath();
//        System.out.println("Root dir " + absolutePath.getRoot());
//        System.out.println("Absolute path " + absolutePath);
//        System.out.println("Absolute path " + absolutePath.getParent());
//        System.out.println("Name count " + path.getNameCount());
//        System.out.println("Name count " + absolutePath.getNameCount());
//        System.out.println("Sub-path " + absolutePath.subpath(0, 3));
//        Path path6 = Paths.get("../..");
//        System.out.println("Real-path " + path6.toRealPath());
//
//        System.out.println("File exists " + !Files.exists(path));
//        System.out.println("File dose note exists " + Files.notExists(path));
//        System.out.println("Is readable " + Files.isReadable(path));
//        System.out.println("Is writable " + Files.isWritable(path));
//        System.out.println("Is executable " + Files.isExecutable(path));
//
//        System.out.println("Is the same file " + Files.isSameFile(path, path2));

        Path parentPats = absolutePath.getParent();
        Path filePath = parentPats.resolve("test5");
        if (Files.notExists(filePath)) {
            Files.createDirectory(filePath);
        }
        Files.copy(absolutePath, filePath.resolve(fileName2), StandardCopyOption.REPLACE_EXISTING);
//        Files.move(absolutePath, filePath.resolve(fileName2), StandardCopyOption.REPLACE_EXISTING);
        Thread.sleep(10);
        Files.delete(filePath.resolve(fileName2));
    }

    //есть еще StreamReader
    private static void readFileInfo(String fileName) {
        Path path = Paths.get(fileName);
        try {
            List<String> list = Files.readAllLines(path);
            for (String str : list)
                System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Это простой способ чтения файла если файл маленький и его нужно прочитать
    private static void nioReadFileWithBuffer(String fileName) {
        Path path = Paths.get(fileName);
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader bf = Files.newBufferedReader(path, charset)) {
            String str;
            while ((str = bf.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void nioWriteWithBuffer(String fileName) {
        Path path = Paths.get(fileName);
        //String fileName1 = path.getFileName().toString();
        String fileName1 = "hello";

        Charset charset = Charset.forName("UTF-8");
        try (BufferedWriter bf = Files.newBufferedWriter(path, charset)) {
            bf.write(fileName1, 0, fileName1.length());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void nioReadWithStream(String fileName) {
        Path path = Paths.get(fileName);
//        String fileName1 = path.getFileName().toString();
//
//        Charset charset = Charset.forName("UTF-8");
        try (InputStream in = Files.newInputStream(path)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void nioWriteWithStream(String fileName) {
        Path path = Paths.get(fileName);
//        String fileName1 = path.getFileName().toString();
//
//        Charset charset = Charset.forName("UTF-8");
        String str = "hello сергей";
        //StandardOpenOption.APPEND -  для того что бы дописывать в файл
        try (OutputStream stream = Files.newOutputStream(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            stream.write(str.getBytes(), 0 , str.length());
            stream.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

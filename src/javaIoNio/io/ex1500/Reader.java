package javaIoNio.io.ex1500;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Serhii Klunniy
 */
public class Reader {
    Student reader(Path path) throws IOException {
        Student student = null;
        String fileName = path.toString();
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
           student = (Student) in.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }
}

package javaIoNio.io.ex1500;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Serhii Klunniy
 * Путь это адересс нашего файла в операционной системе
 * Относительный путь будет начинаться в том месте где запущена наша jvm
 */
public class Writer {
    void writer(Path path, Object o) {
        String fileName = path.toString();
        try (ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            os.writeObject(o);
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

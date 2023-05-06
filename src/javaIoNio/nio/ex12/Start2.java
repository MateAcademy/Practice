package javaIoNio.nio.ex12;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

/**
 * @author Serhii Klunniy
 */
public class Start2 {
    public static void main(String[] args) {

    }

    private static void writeWithRandomAccess(String fileName) {
        ByteBuffer mark = ByteBuffer.wrap("Marker AREA".getBytes());

        ByteBuffer buffer = ByteBuffer.allocate(10);

        Path path = Paths.get(fileName);

        try (FileChannel openFile = FileChannel.open(path, WRITE, READ)) {


        } catch (Exception e) {
        }
    }
}

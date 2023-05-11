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
 * 1-hello ==========
 * 2-hello ==========
 * 4-hello ==========
 * 5-hello ==========
 */
public class Start2 {
    public static void main(String[] args) {
        writeWithRandomAccess("src/javaIoNio/nio/ex12/book.txt");
    }

    private static void writeWithRandomAccess(String fileName) {
        ByteBuffer mark = ByteBuffer.wrap("Marker AREA\n".getBytes());

        ByteBuffer buffer = ByteBuffer.allocate(10);

        Path path = Paths.get(fileName);

        try (FileChannel openFile = FileChannel.open(path, WRITE, READ)) {
            int numBytes = 0;
            while (buffer.hasRemaining() && numBytes != -1) {
                numBytes = openFile.read(buffer);
            }
            openFile.position(0);
            openFile.write(mark);

            long size = openFile.size();

            openFile.position(size/2);
            mark.rewind();
            openFile.write(mark);

            openFile.position(size-1);
            mark.rewind();  //устанавливаем позицию буффера на начало
            openFile.write(mark);


        } catch (Exception e) {
        }
    }
}

package javaIoNio.nio.ex11exzample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        String path = "src/javaIoNio/nio/ex11exzample/file.txt";
        readNioFile(path);
    }

    private static void readNioFile(String path) {

        try (RandomAccessFile rs = new RandomAccessFile(path, "rw");
             FileChannel channel = rs.getChannel()) {

            ByteBuffer bf = ByteBuffer.allocate(100);
            int read = channel.read(bf);

            while (read > 0) {
                bf.flip();
                while (bf.hasRemaining()) {
                    System.out.print((char) bf.get());
                }
                bf.clear();
                read = channel.read(bf);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package javaIoNio.nio.ex08;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        nioReadWithChannel2("src/javaIoNio/nio/ex08/test.txt");
    }

    private void nioReadWithChannel(String fileName) {
        try {
            FileInputStream file = new FileInputStream(fileName);
            file.getChannel();

            FileOutputStream file2 = new FileOutputStream(fileName);
            file2.getChannel();

        } catch (FileNotFoundException e) {
        }
    }

    private static void nioReadWithChannel2(String fileName) {
        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "rw");
            FileChannel channel = file.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(100);
            int byteNumber = channel.read(buffer);

            while (byteNumber >0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear();
                byteNumber = channel.read(buffer);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

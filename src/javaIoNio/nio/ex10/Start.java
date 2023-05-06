package javaIoNio.nio.ex10;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Start {
    public static void main(String[] args) {
        String pathToFile = "src/javaIoNio/nio/ex10/book.txt";
        nioReadWithChannel2(pathToFile);
    }

    private static void nioReadWithChannel(String fileName) {
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            fi = new FileInputStream(fileName);
            fo = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        fi.getChannel();
        fo.getChannel();
    }

    private static void nioReadWithChannel2(String fileName) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
            FileChannel channel = randomAccessFile.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(100);
            int bytesNumber = channel.read(buffer);
            byte i = 0;
            int index = 1;
            while (bytesNumber > 0) {
                buffer.flip();       //перенос каретки на начало буфера
                while (buffer.hasRemaining()) {
                    //System.out.print((char) buffer.get());
                    if (index % 2 == 0){
                        //System.out.print((char) (i + buffer.get()));
                        byte[] b = new byte[2];
                        b[0] = i;
                        b[1] = buffer.get();
                        String str_utf8 = new String(b, StandardCharsets.UTF_8);
                        System.out.print(str_utf8);
                    } else {
                        i = buffer.get();
                    }
                    index++;
                }
                buffer.clear();
                bytesNumber = channel.read(buffer);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

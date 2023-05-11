package javaIoNio.nio.ex12;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class Start {
    public static void main(String[] args) {
        String pathToFile = "src/javaIoNio/nio/ex12/ newFile.txt";
        //nioReadWithChannel(pathToFile);
        nioWriteWithChannel(pathToFile);
    }

    private static void nioReadWithChannel(String fileName) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
             FileChannel channel = randomAccessFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);
            int bytesNumber = channel.read(buffer);

            while (bytesNumber > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.println((char) buffer.get());
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

    private static void nioWriteWithChannel(String fileName) {
        String str = "You can also create root теперь текст на россхуевом языке";

        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw");
             FileChannel channel = file.getChannel()) {

            //ByteBuffer buffer = ByteBuffer.allocate(str.getBytes().length);
            //wrap делает три вещи, он оборачивает массив байт в буфер, он устанавливает значение поля позишн в ноль
            //те мы находимся в самом начале нашего буфера и также он устанавливает капейсити которое равно размеру нашего массива

            ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
            //buffer.flip(); устанавливает значение счетчика теперь в конце
            channel.write(buffer);

            buffer.clear();
            buffer.compact(); //удаляет все данные которые прочитали; остануться только те которые мы не прочитали
            buffer.mark();
            buffer.reset();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
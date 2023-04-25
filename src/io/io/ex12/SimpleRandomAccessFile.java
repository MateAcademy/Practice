package io.io.ex12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class SimpleRandomAccessFile {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("randome.txt", "rw"); // read, write
            raf.write(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            raf.seek(5);
            raf.write(new byte[]{33, 44, 55});
            raf.seek(0);

            byte[] arr = new byte[10];
            int n = raf.read(arr, 0, 10); // len = 100 exception
            System.out.println(Arrays.toString(arr));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

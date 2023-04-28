package javaIoNio.io;

import java.io.ByteArrayInputStream;

/**
 * @author Serhii Klunniy
 */
public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
//        byte[] arr = new byte[]{ 1, 3, 5 , 7};
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
//
//        int temp;
//        while ((temp = byteArrayInputStream.read()) != -1) {
//            System.out.println(temp);
//        }


        String str = "Hello";
        byte[] arr2 = str.getBytes();
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(arr2, 1, 3);

        int temp2;
        while ((temp2 = byteArrayInputStream2.read()) != -1) {
            System.out.println((char) temp2);
        }
    }
}

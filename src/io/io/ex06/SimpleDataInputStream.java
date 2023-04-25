package io.io.ex06;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream  out = new DataOutputStream(new FileOutputStream("/home/user/dev/Practice/file.txt"));
        byte[] bytes = "hello".getBytes();
        out.write(bytes);
//        out.writeShort(1000);
//        out.writeInt(1111);
//        out.writeLong(999);
//        out.writeUTF("hello world");
        out.flush();

        DataInputStream in = new DataInputStream(new FileInputStream("/home/user/dev/Practice/file.txt"));
        System.out.println(String.valueOf(in.readAllBytes()));
//        System.out.println(in.readShort());
//        System.out.println(in.readInt());
//        System.out.println(in.readLong());
//        System.out.println(in.readUTF());
    }
}

package hillel_shaytan.lesson23.socket2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Servet {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8085)) {

            Socket accept = serverSocket.accept();

            InputStream inputStream = accept.getInputStream();
            OutputStream outputStream = accept.getOutputStream();

            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            for (int i=0; i<10; i++) {
                String line = bufferedReader.readLine();
                oos.writeUTF("OKK");
                oos.flush();
                System.out.println("line= " + line);
            }

            accept.close();



//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream(), StandardCharsets.UTF_8));
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
//
//            new Thread(() -> {
//                String word;
//                while (true) {
//                    try {
//                        if (!((word = bufferedReader.readLine()) != null)) break;
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println(word);
//                    try {
//                        bw.write("OK");
//                        bw.flush(); //это сброс буфера
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }).start();

//            new Thread(() -> {
//                while (true) {
//                    try {
//                        bw.write(String.valueOf(new Scanner(System.in)));
//                        bw.flush();
//
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }).start();
//
//            // можем читать:
//            InputStream inputStream = accept.getInputStream();
//            ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
//            inputStream1.readUTF(); //умеет читать строки


//            OutputStream outputStream = accept.getOutputStream();
//
//            Scanner scanner = new Scanner(System.in);
//            String message = scanner.nextLine();
//
//            outputStream.write(message.getBytes(message));
//            outputStream.flush();

        } catch (IOException e) {
            System.out.println("connection is broken");
        }
    }
}

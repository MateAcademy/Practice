package hillel_shaytan.lesson23.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servet {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8085)) {

            Socket accept = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));

            new Thread(()-> {
                String word;
                while (true) {
                    try {
                        if (!((word = bufferedReader.readLine()) != null)) break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(word);
                }
            }).start();

            OutputStream outputStream = accept.getOutputStream();

            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();

            outputStream.write(message.getBytes(message));
            outputStream.flush();

        } catch (IOException e) {
            System.out.println("connection is broken");
        }
    }
}

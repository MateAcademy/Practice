package hillel.lesson23.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MultithreadingServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8085);

        while (true) {

            Socket accept = serverSocket.accept(); // на этом этапе я жду подключения

            new Thread(() -> {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    String word;

                    while ((word = bufferedReader.readLine()) != null) {
                        System.out.println(word);
                    }

                    OutputStream outputStream = accept.getOutputStream();

                    Scanner scanner = new Scanner(System.in);
                    String message = scanner.nextLine();

                    outputStream.write(message.getBytes(message));
                    outputStream.flush();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();

        }
    }
}

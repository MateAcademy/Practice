package hillel_shaytan.lesson23.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class MultithreadingServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8085);

        ExecutorService tp = Executors.newFixedThreadPool(2);
        Semaphore semaphore = new Semaphore(2);
        while (true) {

            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Socket accept = serverSocket.accept(); // на этом этапе я жду подключения

            tp.execute(() -> {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    String word;

                    while ((word = bufferedReader.readLine()) != null) {
                        System.out.println(word);
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    semaphore.release();
                }
            });

        }
    }
}

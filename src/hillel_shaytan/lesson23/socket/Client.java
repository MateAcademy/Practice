package hillel_shaytan.lesson23.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket("localhost", 8085)) {

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                printWriter.println("hello my socket");
                printWriter.println(scanner.nextLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

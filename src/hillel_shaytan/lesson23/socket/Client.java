package hillel_shaytan.lesson23.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 8085)) {

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            printWriter.println("hello my socket");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

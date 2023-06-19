package hillel.lesson23.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servet {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8085)) {

            Socket accept = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            String word;

            while ((word = bufferedReader.readLine()) != null) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.out.println("connection is broken");
        }
    }
}

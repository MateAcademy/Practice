package hillel_shaytan.lesson23.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Задача напишите exit что бы коннекшн закрылся?
 */
public class Servet {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8085)) {

            Socket accept = serverSocket.accept(); // сервер жди пока к тебе кто то подконнектится :) Socket - это обьект который позволяет настроить коммуникацию
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

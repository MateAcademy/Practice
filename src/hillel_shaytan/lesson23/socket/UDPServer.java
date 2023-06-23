package hillel_shaytan.lesson23.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket(3000);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[256], 256);
        while (true) {
            datagramSocket.receive(datagramPacket);

            int length = datagramPacket.getLength();
            String string = new String(datagramPacket.getData(), 0, length);
            System.out.println("string=" + string);
        }
    }

}

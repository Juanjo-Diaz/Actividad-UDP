package org.example.Tarea1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.List;
import java.util.Random;

public class Servidor {
    public static void main(String[] args) {
        List<String> letras = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
        Random random = new Random();
        try {
            // Crea el  socket
            DatagramSocket sSocket = new DatagramSocket(1500);
            byte[] buffer = new byte[1000];

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            System.out.println("Esperando mensajes..");
            while (true) {
                // Recibe y muestra el mensaje
                sSocket.receive(packet);
                String datos = new String(packet.getData(), 0, packet.getLength());
                int num = parseNum(datos);
                System.out.println("Mensaje Recibido: " + datos);
            }
        } catch (SocketException e) {
            System.err.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("E/S: " + e.getMessage());
        }
    }
        public static int parseNum(String ){
            int num = 0;
            try {
                num = mensaje
            }
            catch (Exception e){
                System.err.println("Error: " + e.getMessage());
            }
            return num;
        }

}

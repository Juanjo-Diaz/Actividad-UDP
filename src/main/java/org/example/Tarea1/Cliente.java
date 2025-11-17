package org.example.Tarea1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("localhost");
            int puerto = 1500;
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            byte[] buffer = str.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, ip, puerto);

            socket.send(packet);
            socket.close();
        }
        catch (UnknownHostException e) {
            System.err.println("Desconocido: " + e.getMessage());
        }
        catch (SocketException e) {
            System.err.println("Socket: " + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("E/S: " + e.getMessage());
        }
    }
}
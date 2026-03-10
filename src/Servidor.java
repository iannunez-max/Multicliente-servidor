import java.io.*;
import java.net.*;

public class Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(5000);
            System.out.println("Servidor esperando conexiones en el puerto 5000...");

           
            while (true) {
                Socket socket = servidor.accept();
                System.out.println("Nuevo cliente conectado: " + socket.getInetAddress());

              
                HiloCliente hilo = new HiloCliente(socket);
                hilo.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

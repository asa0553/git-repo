import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);  // Connect to server at localhost and port 6666
            System.out.println("Connected to server.");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String message = dis.readUTF();  // Read message sent by server
            System.out.println("Message from Server: " + message);

            dis.close();
            socket.close();  // Close the connection
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

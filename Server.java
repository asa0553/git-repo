import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("Server started and listening for connections.");
        Socket socket = serverSocket.accept();  // server accepts the client connection request
        System.out.println("Client connected.");
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("Hello from Server!");  // sending a message to the client
        dos.close();
        socket.close();
        serverSocket.close();
    }
}

import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        int port = 12345;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client...");

            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Client connected.");
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
                String clientMsg, serverMsg;
                while (true) {
                    clientMsg = in.readLine();
                    if (clientMsg.equalsIgnoreCase("bye")) break;
                    System.out.println("Client: " + clientMsg);
                    
                    System.out.print("Server: ");
                    serverMsg = console.readLine();
                    out.println(serverMsg);
                    if (serverMsg.equalsIgnoreCase("bye")) break;
                }
            }
            System.out.println("Chat ended.");
        } catch (IOException e) {
        }
    }
}

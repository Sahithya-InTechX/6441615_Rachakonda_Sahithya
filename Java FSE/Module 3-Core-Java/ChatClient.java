import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;
        try (Socket socket = new Socket(host, port)) {
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            String serverMsg, clientMsg;

            while (true) {
                System.out.print("Client: ");
                clientMsg = console.readLine();
                out.println(clientMsg);
                if (clientMsg.equalsIgnoreCase("bye")) break;

                serverMsg = in.readLine();
                if (serverMsg.equalsIgnoreCase("bye")) break;
                System.out.println("Server: " + serverMsg);
            }

            socket.close();
            System.out.println("Chat ended.");
        } catch (IOException e) {
        }
    }
}

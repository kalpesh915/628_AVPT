import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            // create server socket for listen incomming connection
            ServerSocket serverSocket = new ServerSocket(9155);
            
            // wait for receive requiest from client
            Socket clientScoket = serverSocket.accept();
            
            
            // create stream for read and write data on/from client socket
            BufferedReader in = new BufferedReader(new InputStreamReader(clientScoket.getInputStream()));
            PrintWriter out = new PrintWriter(clientScoket.getOutputStream(), true);

            
            /// Read data from  client socket
            String message = in.readLine();
            System.out.println("Client : "+message);
            
            /// send data to client
            out.println("Hello Client");
            
            /// releasing resouces
            in.close();
            out.close();
            clientScoket.close();
            serverSocket.close();
        } catch (Exception err) {
            System.out.println("Error is : "+err);
        }
    }
}

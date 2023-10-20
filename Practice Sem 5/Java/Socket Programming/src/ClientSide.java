import java.io.*;
import java.net.*;

public class ClientSide {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9155);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            out.println("Hello, Greetings from client Side");
            
            String response = in.readLine();
            System.out.println("Message From Server is "+response);
 
            in.close();
            out.close();
            socket.close();
            
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}

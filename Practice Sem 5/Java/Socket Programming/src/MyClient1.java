import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9155);
            String message = "";
            Scanner sc = new Scanner(System.in);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            out.println("Hello Server");
            
            while(true){
                message = in.readLine();
                System.out.println("Server Says "+message);
                if(message.equals("exit") || message.equals("Exit")){
                    System.out.println("Chat Closed by Server");
                    break;
                }
                
                System.out.println("Send Message to Server ");
                message = sc.nextLine();
                out.println(message);
            }
 
            in.close();
            out.close();
            socket.close();
            
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}

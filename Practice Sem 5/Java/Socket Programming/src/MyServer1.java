
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyServer1 {

    public static void main(String[] args) {
        try {
            // create server socket for listen incomming connection
            ServerSocket serverSocket = new ServerSocket(9155);
            String message = "";
            Scanner sc = new Scanner(System.in);
            // wait for receive requiest from client
            Socket clientScoket = serverSocket.accept();
            
            // create stream for read and write data on/from client socket
            BufferedReader in = new BufferedReader(new InputStreamReader(clientScoket.getInputStream()));
            PrintWriter out = new PrintWriter(clientScoket.getOutputStream(), true);

            while (true) {
                /// Read data from  client socket

                message = in.readLine();
                System.out.println("Client : " + message);

                if(message.equals("exit") || message.equals("Exit")){
                    System.out.println("Thanks for using Chat Application");
                    break;
                }
                
                /// send data to client
                System.out.println("Send Messages to Client ");
                message = sc.nextLine();
                out.println(message);
            }

            /// releasing resouces
            in.close();
            out.close();
            clientScoket.close();
            serverSocket.close();
        } catch (Exception err) {
            System.out.println("Error is : " + err);
        }
    }
}

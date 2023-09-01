import java.sql.*;
import java.util.Scanner;

public class pro5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
            Connection conn = DriverManager.getConnection(URL, "root", "");
            Statement st = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            
            int id;
            String query;
            
            
            System.out.println("Enter ID for Delete Data");
            id = sc.nextInt();
            
            query = "delete from students where id = "+id;
             int answer = st.executeUpdate(query);
             
             if(answer > 0){
                 System.out.println("Data Deleted");
             }else{
                 System.out.println("Error while Deleting Data");
             }
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
}
}


import java.sql.*;
import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
            Connection conn = DriverManager.getConnection(URL, "root", "");
            Statement st = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            
            int id;
            String fname, lname, city, email, query;
            
            
            System.out.println("Enter First Name ");
            fname = sc.nextLine();
            System.out.println("Enter Last Name ");
            lname = sc.nextLine();
            System.out.println("Enter City ");
            city = sc.nextLine();
            System.out.println("Enter Email Address");
            email = sc.nextLine();
            System.out.println("Enter ID for Update Data");
            id = sc.nextInt();
            
            query = "update students set fname = '"+fname+"', lname = "
                    + "'"+lname+"', city = '"+city+"', email = '"+email+"' where id = "+id;
             int answer = st.executeUpdate(query);
             
             if(answer > 0){
                 System.out.println("Data updated");
             }else{
                 System.out.println("Error while updating Data");
             }
             //System.out.println(answer);
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
}
}

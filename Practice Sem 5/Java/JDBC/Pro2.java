import java.sql.*;
import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
            Connection conn = DriverManager.getConnection(URL, "root", "");
            Statement st = conn.createStatement();
            
            String fname, lname, city, email, query;
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter First Name ");
            fname = sc.nextLine();
            System.out.println("Enter Last Name ");
            lname = sc.nextLine();
            System.out.println("Enter City ");
            city = sc.nextLine();
            System.out.println("Enter Email Address");
            email = sc.nextLine();
            
            query = "insert into students (fname, lname, city, email) values"
                    + "('"+fname+"', '"+lname+"', '"+city+"', '"+email+"')";
            
            
            st.execute(query);
            System.out.println("Data Inserted");
            st.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}

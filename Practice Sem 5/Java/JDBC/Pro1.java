import java.sql.*;

public class Pro1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
            Connection connection = DriverManager.getConnection(URL, "root", "");
            Statement statement = connection.createStatement();
            System.out.println("Database Connected");
            statement.close();
            connection.close();
        }catch(Exception err){
            System.out.println("Error is "+err);
        }
    }
}

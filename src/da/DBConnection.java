package da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;
    public static  Connection getConnection() throws ClassNotFoundException, SQLException {
        if(connection == null){
            //1 . Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2 . Connect Database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8080/t1907m","root","");
        }
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        if(getConnection()!=null){
            System.out.println("ok");
        }
    }
}

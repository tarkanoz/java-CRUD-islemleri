import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static String userName ="root";
    static String password ="12345";
    static   String dbUrl = "jdbc:mysql://localhost:3306/world";

 public Connection getConnection() throws SQLException {
     return DriverManager.getConnection(dbUrl,userName,password);
 }

 public void showErrorMessage(SQLException exception){ //hatayı yönetebileceğimiz bir method yazdık
     System.out.println("Error : " + exception.getMessage());//hata mesajını verir
     System.out.println("Error code :" + exception.getErrorCode()); // veri tabanı hata kodunu verir
 }

}

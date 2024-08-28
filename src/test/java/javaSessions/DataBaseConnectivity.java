package javaSessions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity {

    public WebDriver driver;
    @Test
    public void testingDataBaseConnectivity()  {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("url","userName","password");
            Statement st = con.createStatement();
            st.executeQuery("query");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}

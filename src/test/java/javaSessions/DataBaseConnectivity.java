package javaSessions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.*;

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

    @Test
    public void practice() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("url","username","password");
        Statement st = con.createStatement();
        ResultSet result = st.executeQuery("query");
        result.getRowId(1);
    }
}

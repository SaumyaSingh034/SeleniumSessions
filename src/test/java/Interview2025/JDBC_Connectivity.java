package Interview2025;

import java.sql.*;

public class JDBC_Connectivity {
    public static void main(String[] args){
        try {
            Connection connection = DriverManager.getConnection("","","");
            Statement statement = connection.createStatement();
            ResultSet set= statement.executeQuery("");
            while(set.next()){
                int id = set.getInt("id");
                String name = set.getString("");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

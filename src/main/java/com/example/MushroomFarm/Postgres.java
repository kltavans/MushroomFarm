package com.example.MushroomFarm;
import java.sql.*;

public class Postgres {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String url = "jdbc:postgresql://kandula.db.elephantsql.com:5432/hvicfmtr";
        String username = "hvicfmtr";
        String password = "Qb-3s4yhaWdhO4PipOrxyeolp27vwYXD";

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM testmeting");
            while (rs.next()) {
                System.out.print("metingid ");
                System.out.println(rs.getString(1));
                System.out.print("Column 2 returned ");
                System.out.println(rs.getString(2));
                System.out.print("Column 3 returned ");
                System.out.println(rs.getString(3));
                System.out.print("Column 4 returned ");
                System.out.println(rs.getString(4));
                System.out.print("Column 5 returned ");
                System.out.println(rs.getString(5));
                System.out.print("Column 6 returned ");
                System.out.println(rs.getString(6));
            } 
            rs.close();
            st.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

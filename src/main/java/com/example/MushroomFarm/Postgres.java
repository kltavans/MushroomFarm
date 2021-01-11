package com.example.MushroomFarm;
import java.sql.*;

public class Postgres {
	
	public static void getAlleMetingen()
	{
        try {
    		  Connection con = ConnectionManager.getConnection();
    		  Statement st = con.createStatement();
              ResultSet rs = st.executeQuery("SELECT * FROM metingen");
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
            con.close();
            rs.close();
            st.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

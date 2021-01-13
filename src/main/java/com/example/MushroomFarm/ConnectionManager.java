package com.example.MushroomFarm;

import java.sql.*;

public class ConnectionManager {
	//public static Connection getConnection() {
        
		/*
		 * Gebruik de volgende code om deze database connection te krijgen:
		 * 
		 * private Connection con = null;
		 * private Statement stmt = null;
		 * private ResultSet rs = null;

		 * con = ConnectionManager.getConnection();
		 * stmt = con.createStatement();
		 * rs = stmt.executeQuery(sql); 
		 *
		 */
//		Connection con = null;
//		String driverName = "org.postgresql.Driver";
//    	try {
//            Class.forName(driverName);
//            try {
//            	String url = "jdbc:postgresql://dumbo.db.elephantsql.com:5432/bzdngywh";
//            	String username = "bzdngywh";
//            	String password = "YurydegZVw_m0WjksPTQb1cmzEiV6wP2";
//                con = DriverManager.getConnection(url, username, password);
//            } catch (SQLException ex) {
//                // exception-handling
//                System.out.println("Failed to create the database connection."); 
//            }
//        } catch (ClassNotFoundException ex) {
//        	// exception-handling
//            System.out.println("Driver not found."); 
//        }
//        return con;
//    }
	public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String url = "jdbc:postgresql://dumbo.db.elephantsql.com:5432/bzdngywh";
    	String username = "bzdngywh";
    	String password = "YurydegZVw_m0WjksPTQb1cmzEiV6wP2";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM devices");
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(2));
                System.out.print("Column 2 returned ");
                System.out.println(rs.getString(3));
            }
            rs.close();
            st.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

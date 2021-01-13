package com.example.MushroomFarm;

import java.sql.*;

public class ConnectionManager {
	public static Connection getConnection() {
        
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
		Connection con = null;
		String driverName = "org.postgresql.Driver";
    	try {
            Class.forName(driverName);
            try {
            	String url = "jdbc:postgresql://dumbo.db.elephantsql.com:5432/bzdngywh";
            	String username = "bzdngywh";
            	String password = "YurydegZVw_m0WjksPTQb1cmzEiV6wP2";
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // exception-handling
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
        	// exception-handling
            System.out.println("Driver not found."); 
        }
        return con;
    }
}

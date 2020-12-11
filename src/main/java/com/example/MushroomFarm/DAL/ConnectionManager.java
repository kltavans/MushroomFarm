package com.example.MushroomFarm.DAL;

import java.sql.*;

public class ConnectionManager {
	private static String url = "jdbc:postgresql://hattie.db.elephantsql.com:5432/eginsovo";
	private static String driverName = "org.postgresql.Driver";
	private static String username = "eginsovo";
	private static String password = "MAwqwl8m5-ItPA0nUdxL8FkcWOUzu3Ys";
	private static Connection con;

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
    	try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
                catch (SQLException ex) {
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

package com.example.MushroomFarm.ML;

import java.io.*;
import java.sql.*;

public class CsvWriter {

	public void CsvWriter(Integer batchID) {
		String filename = "C:/Users/Dennis/Documents/GitHub/MushroomFarm/data-batch-" + batchID + ".csv";
		try{
			FileWriter fw = new FileWriter(filename);
			Class.forName("org.postgresql.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:postgresql://dumbo.db.elephantsql.com:5432/bzdngywh", "bzdngywh", "YurydegZVw_m0WjksPTQb1cmzEiV6wP2");
			String query = "SELECT lux, temperatuur, luchtvochtigheid FROM Metingen\r\n"
					+ "LEFT JOIN Devices\r\n"
					+ "ON Metingen.device_id = Devices.device_id\r\n"
					+ "LEFT JOIN Batches\r\n"
					+ "ON Devices.device_id = Batches.device_id\r\n"
					+ "WHERE batch_id =" + batchID + ";";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			fw.append("Lux");
			fw.append(',');
			fw.append("Temperatuur");
			fw.append(',');
			fw.append("Luchtvochtigheid");
			fw.append(',');
			fw.append("Acceptabel");
			fw.append('\n');
			while (rs.next()) {				
				int lx = rs.getInt(1);
				double temp = rs.getDouble(2);
				int hum = rs.getInt(3);
				int score = 0;
				
				if (lx <= 9) {
					fw.append("Geen");
				} else if ((lx > 9) && (lx < 20)) {
					fw.append("WeinigHoog");
				} else {
					fw.append("VeelHoog");
					score += 1;
				}
				fw.append(',');
				
				if ((temp >= 12.0) && (temp <= 18.0)) {
					fw.append("Geen");
				} else if ((temp >= 10.0) && (temp < 12.0)) {
					fw.append("WeinigLaag");
				} else if (temp < 10.0) {
					fw.append("VeelLaag");
					score += 1;
				} else if ((temp > 18.0) && (temp <= 20.0)) {
					fw.append("WeinigHoog");
				} else {
					fw.append("VeelHoog");
					score += 1;
				}
				fw.append(',');
				
				if ((hum >= 70) && (hum <= 80)) {
					fw.append("Geen");
				} else if ((hum >= 50) && (hum < 70)) {
					fw.append("WeinigLaag");
				} else if (hum < 50) {
					fw.append("VeelLaag");
					score += 1;
				} else if ((hum > 80) && (hum <= 90)) {
					fw.append("WeinigHoog");
				} else {
					fw.append("VeelHoog");
					score += 1;
				}
				fw.append(',');
				
				if (score > 0) {
					fw.append("Nee");
				} else {
					fw.append("Ja");
				}
				
				fw.append('\n');
			}
			fw.flush();
			fw.close();
			conn.close();
			System.out.println("CSV File is created successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

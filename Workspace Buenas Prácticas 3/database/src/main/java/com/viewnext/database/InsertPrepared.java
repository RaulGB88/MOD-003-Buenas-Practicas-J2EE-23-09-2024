package com.viewnext.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertPrepared {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		long ini = System.currentTimeMillis();
		Class.forName("org.hsqldb.jdbc.JDBCDriver");

		try (Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydatabase", "SA", "");
				PreparedStatement ps = con.prepareStatement("SELECT MAX(id) AS ID FROM \"PUBLIC\".\"PRODUCT\"");
				ResultSet rs = ps.executeQuery()) {
			long id = 1;
			while (rs.next()) {    
				 id = rs.getLong("ID");
			}
			id++;
			
			System.out.println("Comenzamos a introducir elemento: " + id);
			for(int i = 0; i< 50000; i++) {
				try (PreparedStatement psi = con.prepareStatement("INSERT INTO \"PUBLIC\".\"PRODUCT\"\r\n" + 
						"( \"ID\", \"NAME\", \"PRICE\" )\r\n" + 
						"VALUES (?, ?, ?)")) {
					psi.setLong(1, id);
					psi.setString(2, "Product Batch " + id);
					psi.setLong(3, 56789);
					id++;
					
					psi.execute();
				}
			}
		}

		long fin = System.currentTimeMillis();
		System.out.println("Tiempo total: " + (fin - ini));
	}

}

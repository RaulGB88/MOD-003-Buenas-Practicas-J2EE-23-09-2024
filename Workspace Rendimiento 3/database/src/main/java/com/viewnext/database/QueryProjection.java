package com.viewnext.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryProjection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		long ini = System.currentTimeMillis();
		Class.forName("org.hsqldb.jdbc.JDBCDriver");

		try (Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydatabase", "SA", "");
				PreparedStatement ps = con.prepareStatement("SELECT * FROM \"PUBLIC\".\"PRODUCT\"");
				//PreparedStatement ps = con.prepareStatement("SELECT name FROM \"PUBLIC\".\"PRODUCT\"");
				ResultSet rs = ps.executeQuery()) {
			// No sacamos ningun dato
		}

		long fin = System.currentTimeMillis();
		System.out.println("Tiempo total: " + (fin - ini));
	}

}

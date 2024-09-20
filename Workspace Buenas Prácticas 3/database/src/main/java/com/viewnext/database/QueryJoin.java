package com.viewnext.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryJoin {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		long ini = System.currentTimeMillis();
		Class.forName("org.hsqldb.jdbc.JDBCDriver");

		try (Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydatabase", "SA", "");
				PreparedStatement ps = con.prepareStatement("SELECT c.firstname, c.lastname, p.name, p.price \r\n" + 
						"FROM \"PUBLIC\".\"CUSTOMER\" as c,  \"PUBLIC\".\"INVOICE\" as inv, \"PUBLIC\".\"ITEM\" as i, \"PUBLIC\".\"PRODUCT\" as p\r\n" + 
						"WHERE c.id = inv.customerid\r\n" + 
						"AND inv.id = i.invoiceid\r\n" + 
						"AND i.productid = p.id");
//				PreparedStatement ps = con.prepareStatement("SELECT c.firstname, c.lastname, p.name, p.price \r\n" + 
//						"FROM \"PUBLIC\".\"CUSTOMER\" as c  JOIN \"PUBLIC\".\"INVOICE\" as inv ON c.id = inv.customerid  \r\n" + 
//						"JOIN \"PUBLIC\".\"ITEM\" as i ON  inv.id = i.invoiceid \r\n" + 
//						"JOIN \"PUBLIC\".\"PRODUCT\" as p ON i.productid = p.id");
				ResultSet rs = ps.executeQuery()) {
			// No sacamos ningun dato
			
		}

		long fin = System.currentTimeMillis();
		System.out.println("Tiempo total: " + (fin - ini));
	}

}

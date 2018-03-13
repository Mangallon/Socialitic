package com.socialitic.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private Connection conexion;
	
	public void conectarDB () throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		//cargar Driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		//Crear Driver Manager
		this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/socialitic?user=root&password=root");
		
		
	} 
	
}

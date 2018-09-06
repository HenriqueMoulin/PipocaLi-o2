package br.usjt.arqsw18.pipoca.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
		private static String url = "jdbc:mysql://localhost:3306/pipocadb?autoReconnect=true&useSSL=false";    
	    private static String driverName = "com.mysql.jdbc.Driver";   
	    private static String username = "root";   
	    private static String password = "123456";
	    private static Connection con;

	    public static Connection getConnection() {
	        try {
	            Class.forName(driverName);
	            try {
	                con = DriverManager.getConnection(url, username, password);
	            } catch (SQLException ex) {
	                System.out.println("Falha ao criar conexão com o banco de dados"); 
	            }
	        } catch (ClassNotFoundException ex) {
	            System.out.println("Driver não encontrado."); 
	        }
	        return con;
	    }

}
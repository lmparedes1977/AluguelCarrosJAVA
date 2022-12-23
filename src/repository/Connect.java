package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	private static final String URL = "jdbc:mysql://localhost:3306/aluguel_carros_java";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	
	public static Connection getConnect() {
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conexao;
	}

}

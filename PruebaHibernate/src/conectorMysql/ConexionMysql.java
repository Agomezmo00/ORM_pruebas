package conectorMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/nba?useSSL=false";
		String usuario = "root";
		String pass = "alumno";
		System.out.println("Intenta conectar al servidor "+url);
		
		try {
			Connection MiConexion = DriverManager.getConnection(url, usuario, pass);
			
			System.out.println("Conectado con éxito");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		

	}

}

package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private Conexion() {
		
	}
	
	private static Connection instancia;

	public synchronized static Connection getInstancia() {
		if(instancia == null) {
			String user = "admin";
			String pass = "12345";
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/servicio_tecnico";
			
			try {
				Class.forName(driver);
				instancia = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return instancia;
	}
}

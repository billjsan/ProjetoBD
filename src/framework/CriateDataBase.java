package framework;

import java.sql.SQLException;

public class CriateDataBase implements DriveManager{
		
	public void teste() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			DriveManager.registerDriver(
					new com.mysql.cj.jdbc.Driver());
		
			e.printStackTrace();
		}
		
		DriveManager.getConnection("jdbc::mysql://localhost:3306/aula", "root","");
		System.out.println("chegou aqui");
		
	}
	
}

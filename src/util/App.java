package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import framework.CriateDataBase;
import framework.DriveManager;

public class App implements DriveManager {
	
	public static void main(String[] args) throws SQLException  {
		
		Connection con = null ;
		Statement stmt = null;
		ResultSet rs = null ;
		//User user = null;
		String url = "jdbc:mysql://localhost:3306";
		
		CriateDataBase teste = new CriateDataBase();
		
		teste.teste();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriveManager.getConnection(url, "root","");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

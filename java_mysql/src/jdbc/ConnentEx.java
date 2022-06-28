package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnentEx {
	public static void main(String[] args) throws SQLException {
		
		String store = "kyobo";
		//연결 문자열
		//jdbc:mysql://localhost:포트(3306)/데이터베이스/allowPUblicKeyRetrieval=true&useSSL=false&serverTimezone=Asia/Seoul
		String url = "jdbc:mysql://localhost:3306/workbench?allowPublicKeyRetrieval=true&false&serverTimezone=Asia/Seoul";
		String id = "root";
		String password = "000000"; // 비밀번호
		String sql = "ALTER TABLE books ADD store";
				
		Connection conn = DriverManager.getConnection(url, id, password);
		Statement stmt = conn.createStatement();
		PreparedStatement st = conn.prepareStatement(sql);
		try {
		st.setString(0, sql);
		} catch (Exception e) {
			
		}
		int result = st.executeUpdate();
		System.out.println(result);

		

	}
}

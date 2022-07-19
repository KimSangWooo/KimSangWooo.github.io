import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world"; // 디비주소
		String id = "root"; // 아이디
		String password = "root"; // 비밀번호

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 적재 성공"); // 패키지와 클래스
			
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 못찾음");
		} catch (SQLException e) {
			System.out.println("데이터베이스연결실패");
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

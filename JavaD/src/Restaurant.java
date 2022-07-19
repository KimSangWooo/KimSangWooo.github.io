import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import kr.co.green.DButil;

public class Restaurant {

	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	public static void printAllRes() {

		try {
			conn = DButil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM restaurant");

			while (rs.next()) {
				int id = rs.getInt("id");
				String tellNum = rs.getString("tellNum");
				String address = rs.getString("address");

				System.out.println("id : " + id + ", 제목 : " + tellNum + ", 가격 :  " + address);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DButil.closeRS(rs);
			DButil.closeStmt(stmt);
			DButil.closeConn(conn);
		}
	}

}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.green.DButil;

public class RestTest {

	private Restaurants resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String tellNum = rs.getString("tellNum");
		String address = rs.getString("address");
		return new Restaurants(id, name, tellNum, address);
	}

	public int add(Restaurants res) throws SQLException {
		String query = "INSERT INTO restaurant(name, tellNum) VALUES (? , ?)";
		System.out.println("추가: " + query);

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, res.getName());
			pstmt.setString(2, res.getTellNum());

			return pstmt.executeUpdate();
		} finally {
			DButil.closeStmt(pstmt);
			DButil.closeConn(conn);
		}
	}

	public List<Restaurants> list() throws SQLException {
		String query = "SELECT * FROM restaurant";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurants> list = new ArrayList<>();
		try {
			conn = DButil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DButil.closeRS(rs);
			DButil.closeStmt(stmt);
			DButil.closeConn(conn);
		}
		return list;
	}

	public Restaurants selectByName(String name) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE name = '" + name + "'";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DButil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DButil.closeRS(rs);
			DButil.closeStmt(stmt);
			DButil.closeConn(conn);
		}
	}

	public Restaurants selectByPrice(int price) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE name = " + price + "";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DButil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
		} finally {
			DButil.closeRS(rs);
			DButil.closeStmt(stmt);
			DButil.closeConn(conn);
		}
	}

	public int delete(int id) throws SQLException {
		String query = "DELETE FROM books WHERE id = " + id;

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DButil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DButil.closeStmt(stmt);
			DButil.closeConn(conn);
		}
	}

	public int update(Restaurants res) throws SQLException {
		String query = "UPDATE restaurant SET name = '" + res.getName() + "', tellNum = " + res.getTellNum()
				+ " WHERE address = '" + res.getAddress() + "', id = " + res.getId();

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DButil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DButil.closeStmt(stmt);
			DButil.closeConn(conn);
		}
	}

}

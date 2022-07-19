import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.green.DButil;

public class ResDaoImpl implements RestDao {
	private Restaurants resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String tellNum = rs.getString("tellNum");
		String address = rs.getString("address");

		return new Restaurants(id, name, tellNum, address);
	}

	public int[] create(List<Restaurants> list) throws SQLException {
		String query = "INSERT INTO restaurant (name, tellNum, address) VALUES (?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);

			for (Restaurants r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getTellNum());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch();

			}

			return pstmt.executeBatch();

		} finally {
			DButil.closeConn(conn);
			DButil.closeStmt(pstmt);
		}
	}

	@Override
	public int create(String name, String tellNum, String address) throws SQLException {
		String query = "INSERT INTO restaurant (name, tellNum, address) VALUES (?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, tellNum);
			pstmt.setString(3, address);

			return pstmt.executeUpdate();
		} finally {
			DButil.closeConn(conn);
			DButil.closeStmt(pstmt);

		}

	}

	@Override
	public List<Restaurants> read() throws SQLException {
		String query = "select * from restaurant";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurants> list = new ArrayList<>();

		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String tellNum = rs.getString("tellNum");
				String address = rs.getString("address");

				list.add(new Restaurants(id, name, tellNum, address));
			}
		} finally {
			DButil.closeRS(rs);
			DButil.closeConn(conn);
			DButil.closeStmt(pstmt);
		}
		return list;
	}

	public Restaurants read(int id) throws SQLException {
		String query = "select * from restaurant WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				return resultMapping(rs);
			}
		} finally {
			DButil.closeConn(conn);
			DButil.closeRS(rs);
			DButil.closeStmt(pstmt);
		}
		return null;
	}

	public int update(int id, String name, String tellNum, String address) throws SQLException {
		String query = "update restaurant set name = ? , tellNum = ?, address = ? WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, tellNum);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);

			return pstmt.executeUpdate();
		} finally {
			DButil.closeConn(conn);
			DButil.closeStmt(pstmt);
		}
	}

	public int delete(int id) throws SQLException {
		String query = "delete from restaurant where id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);

			return pstmt.executeUpdate();
		} finally {
			DButil.closeConn(conn);
			DButil.closeStmt(pstmt);
		}

	}
}

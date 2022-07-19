import java.sql.SQLException;
import java.util.List;

public interface RestDao {
	int create(String name, String tellNum, String add) throws SQLException;

	List<Restaurants> read() throws SQLException;

	Restaurants read(int id) throws SQLException;

	int update(int id, String name, String tellNum, String address) throws SQLException;

	int delete(int id) throws SQLException;

//	int[] create(List<Restaurants> asList);
}

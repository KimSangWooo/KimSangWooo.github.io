import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class TestRestDao {

	public static void main(String[] args) {
		RestDao dao = new ResDaoImpl();

		try {
//			int result = dao.creat("테스트식당", "1564650", "느그집");
//			System.out.println(result == 1);
//			
//			System.out.println(dao.read(3));
//			
//			int result2 = dao.update(3, "맛있는데", "5645644", "부산서면");

			ResDaoImpl impl = (ResDaoImpl) dao;
			int[] result = impl.create(Arrays.asList(new Restaurants(0, "배치", "321320", "느그집"),
					new Restaurants(0, "배치2", "56465804", "영도")));

			System.out.println(Arrays.toString(result));

//			System.out.println(result2 == 1);
//			System.out.println(dao.read(3));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

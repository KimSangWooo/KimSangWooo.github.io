import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class RestApp {
	private RestTest rsa;

	public RestApp(RestTest rsa) {
		super();
		this.rsa = rsa;
	}

	public void menu() {
		System.out.println("1. 추가, 2. 목록, 3. 삭제, 4. 수정, 5. 검색(제목), 6.검색(아이디)");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		switch (num) {
		case 1:
			add();
			break;
		case 2:
			list();
			break;
		case 3:
			delete();
			break;
		case 4:
			update();
			break;
		case 5:
			search();
			break;
		default:
			break;
		}
	}

	private void list() {
		try {
			List<Restaurants> list = rsa.list();

			if (list.size() > 0) {
				for (Restaurants r : list) {
					System.out.println(r);
				}
			} else {
				System.out.println("책 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는 과정이 실패했습니다. 다시 시도해주세요.");
		}
	}

	private void search() {
		System.out.println("검색할 식당 이름을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		Restaurants res;
		try {
			res = rsa.selectByName(name);
			System.out.println(res);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void update() {
		list();
		System.out.println("수정할 번호, 새 제목, 새 가격 순입력");
		Scanner scan = new Scanner(System.in);

		int id = scan.nextInt();
		String name = scan.next();
		String tellNum = scan.next();
		String address = scan.next();

		try {
			int result = rsa.update(new Restaurants(id, name, tellNum, address));
			System.out.println(result + "행 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void delete() {
		list();
		System.out.println("삭제할 번호?");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		try {
			int result = rsa.delete(id);
			if (result > 0) {
				System.out.println(result + "개의 책이 삭제되었습니다.");
			} else {
				System.out.println("없는 번호입니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 삭제하는 과정이 실패했습니다. 다시 시도해주세요.");
		}
	}

	private void add() {
		System.out.println("식당이름, 전화번호 입력하세요");
		Scanner scan = new Scanner(System.in);
		String name = null;
		boolean go = false;
		do {
			name = scan.next();

			go = name.length() > 40;
			if (go) {
				System.out.println("40자를 넘을 수 없습니다. 다시 입력해주세요.");
			}
		} while (go);

		String tellNum = scan.next();

		try {
			int result = rsa.add(new Restaurants(name, tellNum));

			System.out.println(result + "개의 식당이 추가되었습니다.");
		} catch (SQLException e) {
			int code = e.getErrorCode();
			if (code == 1062) {
				System.out.println("중복된 이름. 상호명을 다시 확인해주세요.");
			}
			System.out.println("데이터를 추가하는 과정이 실패했습니다. 다시 시도해주세요.");
		}
	}

	public static void main(String[] args) {
		RestApp app = new RestApp(new RestTest());
		app.menu();
	}

}

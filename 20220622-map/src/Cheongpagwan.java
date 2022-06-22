import java.util.Map.Entry;
import java.util.*;

// 중국집 주문 가격 계산기
// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000
// 탕수육 : 10000

// 계산 결과 출력 기능
// 메뉴를 추가 할 수 있음
// 추가된 메뉴도 함께 계산 결과가 출력 가능하게 하거라.
public class Cheongpagwan {

	String menu;

	public Cheongpagwan(String menu) {
		this.menu = menu;

	}

	@Override
	public String toString() {
		return menu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(menu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cheongpagwan other = (Cheongpagwan) obj;
		return Objects.equals(menu, other.menu);
	}

	public static int getSum() {
		Scanner s = new Scanner(System.in);
		Map<Cheongpagwan, Integer> map = new HashMap<>();
		map.put(new Cheongpagwan("짜장면"), 2500);
		map.put(new Cheongpagwan("짬뽕"), 4000);
		map.put(new Cheongpagwan("볶음밥"), 4000);

		System.out.println("짜장면 몇그릇 뭇노?");
		int howza = s.nextInt();

		System.out.println("짬뽕 몇그릇 뭇노?");
		int howzam = s.nextInt();

		System.out.println("볶음밥 몇그릇 뭇노?");
		int howbok = s.nextInt();
		int sum = (map.get(new Cheongpagwan("짜장면")) * howza) + (map.get(new Cheongpagwan("짬뽕")) * howzam)
				+ (map.get(new Cheongpagwan("볶음밥")) * howbok);

		System.out.println(sum);

		System.out.println("메뉴 추가할래? \n 1.예 \n 2.예");
		int a = s.nextInt();
		
		if (a == 1 || a == 2) {
		System.out.println("추가할 메뉴 이름이랑 가격 입력하셈");
		}
		
		String temp = s.nextLine();
		String newmenu = s.nextLine();
		int newp = s.nextInt();

		map.put(new Cheongpagwan(newmenu), newp);
		System.out.println("메뉴 추가 완료  \n" + map);

		System.out.println("짜장면 몇그릇 뭇노?");
		int nhowza = s.nextInt();

		System.out.println("짬뽕 몇그릇 뭇노?");
		int nhowzam = s.nextInt();

		System.out.println("볶음밥 몇그릇 뭇노?");
		int nhowbok = s.nextInt();

		System.out.println(newmenu + " 몇그릇 뭇노?");
		int howt = s.nextInt();

		int newsum = (map.get(new Cheongpagwan("볶음밥")) * nhowbok) + (map.get(new Cheongpagwan("짬뽕")) * nhowzam)
				+ (map.get(new Cheongpagwan("짜장면")) * nhowza) + (map.get(new Cheongpagwan(newmenu)) * howt);

//		System.out.println(newsum);

		return newsum;

	}

	public static void main(String[] args) {

		System.out.println(getSum());

	}

}
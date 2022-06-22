import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일", 1); // 왼쪽이 key, 오른쪽이 value
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이"));
		
		if (map.containsKey("이")) {
			map.put("이", 2222);
		};
		
		System.out.println(map.get("이"));

	}

}

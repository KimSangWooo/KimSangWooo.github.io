import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("qwer");
		set.add(Integer.valueOf(10));
		set.add("qwer"); //0번 인덱스와 중복이 되기 때문에 걸러짐
		
		System.out.println(set.size()); //그래서 사이즈는 2
		System.out.println(set.toString()); //
		
		for (Object o : set) {
			System.out.println(o);
		}
		
		Iterator<Object> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

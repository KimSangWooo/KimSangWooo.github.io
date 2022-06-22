import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<> ();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		System.out.println(set.size());
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); //set 의 특징은 삽입 순서를 신경쓰지 않고 무작위로 출력
		}
		
		
		set.contains("banana");
		set.contains("donut");

	}

}

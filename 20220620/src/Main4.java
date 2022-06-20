import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Main4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		//위의 리스트에서 5글자 문자열만 찾아서 지우기
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			
			if(iterator.next().length() == 5) {
				iterator.remove();
			}
		}
		
		System.out.println(list);
		
	}

}

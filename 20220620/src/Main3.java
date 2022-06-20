import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} 
		
		list.set(2, 15);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.add(0,50);
		System.out.println(list);
		
		

	}

}

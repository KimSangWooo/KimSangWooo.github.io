import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(156);
		list.add(109);
		list.add(99);
		list.add(21);
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);

		}
		System.out.println(sum);
		

	}

}

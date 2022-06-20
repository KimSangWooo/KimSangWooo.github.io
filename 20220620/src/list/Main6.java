package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 9, 1));

		Collections.sort(list);
		System.out.println(list);

		int index = Collections.binarySearch(list, 7);
		System.out.println(index);

		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);

		System.out.println(Collections.max(list));
		
		
		Collections.fill(list, 10);
		System.out.println(list);
		
		Collections.replaceAll(list, 10, 11);
		System.out.println(list);
		
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target);
		System.out.println(list);

	}

}

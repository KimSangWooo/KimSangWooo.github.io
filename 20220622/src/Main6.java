import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Set;

public class Main6 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet(); //입력받은 값을 기억하는 hashset
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));
		
		set.addAll(set2);
		System.out.println(set);

	}

}

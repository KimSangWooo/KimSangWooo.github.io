import java.util.*;

public class WordFreq {

	public static void main(String[] args) {

		String line = "Hello. I'm a java developer.";
		Map<Character, Integer> m2 = new HashMap<Character, Integer>();

		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i); //변수에 문자를 담음
			if (!m2.containsKey(c)) {
				m2.put(c, 1);
			} else {
				m2.put(c, m2.get(c) + 1);
			}
		}
		System.out.println(m2);
//		Map<String, Integer> m = new HashMap<String, Integer>();
//		
//		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
//		
//		for (String a : sample) {
//			Integer freq = m.get(a);
//			m.put(a, (freq == null) ? 1 : freq + 1);
//		}
//		
//		System.out.println(m.size() + "단어가 있습니다");
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);

	}

}

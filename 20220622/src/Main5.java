import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {

	public static void main(String[] args) {
		//증복되지 않는 1 ~ 45 사이의 정수 6개를 가지는 집합
		Set<Integer> lotto = new HashSet<>();
		Random random = new Random(45);
		
		while(lotto.size() < 6) {
		lotto.add(random.nextInt(45) + 1);
		}
		
		System.out.println(lotto);
		
		List<Integer> list = new ArrayList<>(lotto);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}

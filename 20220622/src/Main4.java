import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		
		System.out.println(setUnion);
		
		Set<Integer> setDuplicate = new HashSet<>(); //교집합
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);
		
		Set<Integer> setLeft = new HashSet<>(); //차집합
		setLeft.addAll(setA);
		setLeft.removeAll(setB);
		System.out.println(setLeft);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7,6,5,4,3,2,1));
		System.out.println(setSame.equals(setUnion));

	}

}

import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] sub = new int[s.nextInt()];
		int[] newgrade = new int [sub.length];
		for (int i = 0; i < sub.length; i++) {
			sub[i] = s.nextInt();
			

		}
		Arrays.sort(sub);
		for (int i = 0; i < sub.length; i++) {
			newgrade[i] = sub[i] / sub[2] * 100 ;
			System.out.println(newgrade[i]);
		
		}
	

	}

}

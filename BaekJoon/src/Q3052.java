import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

import java.util.HashSet;

public class Q3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ten = new int[10];
		HashSet<Integer> ex = new HashSet<Integer>();

		for (int i = 0; i < ten.length; i++) {
			ten[i] = s.nextInt();
			ex.add(ten[i] % 42);

		}
		System.out.println(ex.size());

	}

}
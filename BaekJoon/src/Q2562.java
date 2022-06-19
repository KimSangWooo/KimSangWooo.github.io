import java.util.Scanner;
import java.util.Arrays;

public class Q2562 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = 0;
		int maxindex = 0;
		int arr[] = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				maxindex = i;
			}

		}
		System.out.print(max);
		System.out.print(" "+(maxindex+1));
	}
}
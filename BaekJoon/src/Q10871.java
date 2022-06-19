import java.util.Scanner;
public class Q10871 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int f = s.nextInt();
		for ( int i = 0; i < t; i++) {
			int a = s.nextInt();
			if (a < f) {
				System.out.println(a);
			}
		}
	}
}

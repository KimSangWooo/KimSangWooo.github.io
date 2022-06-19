import java.util.Scanner;
public class Q2438 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		int v = 0;
		for (int i = 1; i <= j; i++) {
			for (v = 0; i > v; v++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
} 

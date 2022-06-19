import java.util.Scanner;
public class Q2439 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n-1-j; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < 1+j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
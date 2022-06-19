//a+b 참이면 n번만큼 수행하라
import java.util.Scanner;
public class Q10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter = new Scanner(System.in);
		int n = enter.nextInt();

		
		for (int i = 0; i<n; i++) {
			int a = enter.nextInt();
			int b = enter.nextInt();
			System.out.println(a+b);
		}
		}
	}

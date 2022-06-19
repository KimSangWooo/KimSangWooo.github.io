import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		int n = 0;
		int copy = a;

		while (true) {
			a = ((a%10)*10) + (((a/10)+(a%10))%10); 
			n++;
			
			if (copy == a) {
				break;
			}
		}
		System.out.println(n);
	}

}

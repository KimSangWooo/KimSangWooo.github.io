import java.util.Scanner;
public class Q1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter = new Scanner(System.in);
		
		int a = enter.nextInt();
		int b = enter.nextInt();
		
		if (a>b) {
			System.out.print(">");
		}
		else if (a<b) {
			System.out.print("<");
		
			}
		else if (a==b) {
			System.out.print("==");
		}
		
	}

}
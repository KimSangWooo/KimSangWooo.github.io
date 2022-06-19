import java.util.Scanner;
public class Q2480{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter = new Scanner(System.in);
		int a = enter.nextInt();
		int b = enter.nextInt();
		int c = enter.nextInt();
		
		int max = Math.max(Math.max(a,b),c);
		
		if (a==b && a==c && b==c) {
			System.out.println(10000+(a*1000));
		} else if (a!=b && a!=c && b!=c) {
			System.out.println(max*100);
		} else if (a==b && a!=c && b!=c) {
			System.out.println(1000+(a*100));
		} else if (b==c && a!=c && a!=b) {
			System.out.println(1000+(b*100));
		} else if (a==c && b!=c && a!=b) {
			System.out.println(1000+(c*100));
		}
			}

}
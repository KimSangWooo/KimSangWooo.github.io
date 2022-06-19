import java.util.Scanner;

public class Q14681{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter = new Scanner(System.in);
		int x = enter.nextInt();
		int y = enter.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("1");
		} else if (x<0 && y>0) {
			System.out.println("2");
		} else if (x<0 && y<0) {
			System.out.println("3");
		} else if (x>0 && y<0) {
			System.out.println("4");
		} 
		
		
		
	}

}
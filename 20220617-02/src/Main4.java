import java.util.Scanner;

public class Main4 {
	public void print(Object a) {
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		Object o = new Object();
		o.equals(new String("asdf"));
		
		o.equals(new Scanner(System.in));
		
		o.equals(Integer.valueOf(10));
	}
}

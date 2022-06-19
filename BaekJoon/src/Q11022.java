//정수 하나를 입력하여 케이스 갯수를 설정한다
// 케이스마다 정수 두개를 입력받아 더한 값을 출력시킨다
//출력값 앞에 Case #n: 이라는 문자열을 동원시킨다.
import java.util.Scanner;
public class Q11022 {
	public static void main (String[] args) {
		Scanner enter = new Scanner(System.in);
		int j = enter.nextInt();
		int a, b;
		
		for (int i = 1; i <= j; i++) {
			 a = enter.nextInt();
			 b = enter.nextInt();
			 System.out.println("Case #"+i+":"+" "+a+" + "+b+" = "+(a+b));
			}
		
	}
}
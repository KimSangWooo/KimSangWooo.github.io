import java.util.Scanner;

//은행 계좌
// 필드 : 잔고

//메소드 : 입금 : void
//출금 : void >>출금을 잔고 보유액보다 많이 하면 예외(부족한 금액이 얼마인지)를 발생시켜서 throws 할 수 ㅣㅇㅆ게
//getter setter 
public class Main6 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Account a1 = new Account(500000);
		
		try{
		a1.putout();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

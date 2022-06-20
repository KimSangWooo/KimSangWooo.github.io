import java.util.Scanner;

public class Account {
	Scanner s = new Scanner(System.in);
	int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void putin() {
		int deposite = s.nextInt();
		this.balance = this.balance + deposite;
		System.out.println(this.balance );
	}

	public void putout() throws Exception {
		int withdraw = s.nextInt(); 
		if (withdraw > this.balance) {
			throw new Exception("잔고가 부족합니다."+(withdraw - this.balance)+"원");
		}
		this.balance = this.balance - withdraw;

		System.out.println(this.balance);
	}
}

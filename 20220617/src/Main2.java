
public class Main2 {

	public static void main(String[] args) {
		String s = null;
		try {
			int div = 10/0;
			s.equals("asdf");
		} catch (NullPointerException e) {
			System.out.println("널익자리");
		} catch(ArithmeticException a) {
			System.out.println("수익처리");
		}
		System.out.println("정상종료");
	}

}


public interface Days {
	public int NUM = 10; // 상수형태로 정의가 가능
}

interface Myinterface {
	default void printHello() {
		System.out.println("Hello");
	}

	public static void myStaticMethod() {

	}

	public static int sum(int a, int b) {
		return a + b;
	}
}

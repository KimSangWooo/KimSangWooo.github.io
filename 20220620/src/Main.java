import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		//기본형 타입의 value 값을 집어넣을 수가 없다.
		
		list.add(500); // int 타입의 500을 Integer 타입으로 오토박싱이 일어남.
		
		int size = list.size();
		System.out.println(size);
		
		System.out.println(list.get(0));
	}

}

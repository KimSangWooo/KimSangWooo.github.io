class Animal {
	public void sound() {
		System.out.println("동물은 소리를 냅니다");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("아우아우");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("먀우먀우");

	}
}

class Poodle extends Dog {
	@Override
	public void sound() {
		System.out.println("푸드득");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		Dog p = new Poodle();
		
		
		Animal a = p;
		
		a.sound(); // 푸들의 소리를 냄. (최상위 클래스 타입 뒤의 인스턴스는 뒤의 하위 클래스 타입을 참조할 수 있음)
		//업캐스팅은 자동적으로 이루어짐.
		

	}

}

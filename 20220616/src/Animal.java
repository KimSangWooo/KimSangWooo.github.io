// 동물원 관리
// 동물 - 종, 나이, 무게

// 직원 - 역할(조련사, 경영 등등)
// 조련사는 동물을 담당합니다.

// 관리하는 동물은 육식/초식으로 나누어서 관리됩니다.
// 주식으로 분류하여 동물 목록을 볼 수 있음
// 조련사 담당에 따라 동물 목록을 볼 수 있음. (담당이 없는 동물도 볼 수 있어야 함)
import java.util.Scanner;

public class Animal {

	private String spieces;
	private int age;
	private int weight;
	private String eattype;

	public static void main(String[] args) {

		System.out.println("신화 동물원에 오신것을 환영합니다.");

		Animal[] animals = new Animal[15];
		animals[0] = new Carnivore("트리케라톱스", 8, 1350, "육식");
		animals[1] = new Carnivore("트리케라톱스", 3, 620, "육식");
		animals[2] = new Herbivore("유니콘", 12, 330, "초식");
		animals[3] = new Herbivore("유니콘", 2, 330, "초식");
		animals[4] = new Herbivore("유니콘", 13, 430, "초식");
		animals[5] = new Herbivore("유니콘", 10, 300, "초식");
		animals[6] = new Herbivore("유니콘", 18, 390, "초식");
		animals[7] = new Herbivore("페가수스", 26, 650, "초식");
		animals[8] = new Herbivore("페가수스", 26, 650, "초식");
		animals[9] = new Herbivore("페가수스", 26, 650, "초식");
		animals[10] = new Carnivore("해태", 44, 980, "육식");
		animals[11] = new Carnivore("비익조", 21, 1280, "육식");
		animals[12] = new Carnivore("해태", 21, 1280, "육식");
		animals[13] = new Carnivore("메두사", 21, 65, "육식");
		animals[14] = new Carnivore("메두사", 200, 50, "육식");

		Workers[] workers = new Workers[4];
		workers[0] = new Trainner("조련사", "강해상", "트리케라톱스");
		workers[1] = new Trainner("조련사", "은가누", "유니콘");
		workers[2] = new Trainner("조련사", "이재용", "해태");
		workers[3] = new Executive("경영자", "장첸");

		Trainner[] ts = new Trainner[3];
		ts[0] = new Trainner("조련사", "강해상", "트리케라톱스");
		ts[1] = new Trainner("조련사", "은가누", "유니콘");
		ts[2] = new Trainner("조련사", "이재용", "해태");

		Animal[] title = new Animal[6];
		title[0] = animals[0];
		title[1] = animals[2];
		title[2] = animals[7];
		title[3] = animals[10];
		title[4] = animals[11];
		title[5] = animals[13];

		boolean v = true;
		while (v) {
			System.out.println(
					"필요한 정보를 입력 해 주세요 \n 1.동물 종류 보기 \n 2.동물 마릿수 보기 \n 3.직원 목록 보기 \n 4.동물별 담당 조련사 보기 \n 5.육식동물 보기 \n 6.초식동물 보기");
			Scanner s = new Scanner(System.in);
			int infor = s.nextInt();
			switch (infor) {

			case 1:

				for (int i = 0; i < title.length; i++) {
					System.out.println(title[i].getSpieces());
				}

				System.out.println();
				break;

			case 2:
				int[] count = { 0, 0, 0, 0, 0, 0 };
				for (int i = 0; i < animals.length; i++) {
					if (animals[i].getSpieces().equals("트리케라톱스")) {
						count[0]++;
					} else if (animals[i].getSpieces().equals("유니콘")) {
						count[1]++;
					} else if (animals[i].getSpieces().equals("페가수스")) {
						count[2]++;
					} else if (animals[i].getSpieces().equals("해태")) {
						count[3]++;
					} else if (animals[i].getSpieces().equals("비익조")) {
						count[4]++;
					} else if (animals[i].getSpieces().equals("메두사")) {
						count[5]++;
					}
				}
				for (int i = 0; i < title.length; i++) {
					System.out.println(title[i].getSpieces() + " " + count[i] + "마리");
				}

				System.out.println();
				break;

			case 3:
				for (int i = 0; i < workers.length; i++) {
					System.out.println(workers[i].getName() + "(" + workers[i].getRole() + ")");
				}

				System.out.println();
				break;

			case 4:
				for (int i = 0; i < ts.length; i++) {
					ts[i].manage();
				}

				for (int i = 0; i < title.length; i++) {
					if (!title[i].getSpieces().equals("트리케라톱스"))
						if (!title[i].getSpieces().equals("유니콘"))
							if (!title[i].getSpieces().equals("해태")) {
								System.out.println("담당 조련사가 없는 동물 : " + title[i].getSpieces());
							}

				}

				System.out.println();
				break;

			case 5:
				System.out.println("---------------육식 동물 ----------------");
				for (int i = 0; i < title.length; i++) {
					if (title[i] instanceof Carnivore) {
						Carnivore can = (Carnivore) title[i];
						System.out.println(can.getSpieces());
					}
				}

				System.out.println();
				break;

			case 6:
				System.out.println("---------------초식 동물 ----------------");
				for (int i = 0; i < title.length; i++) {
					if (title[i] instanceof Herbivore) {
						Herbivore her = (Herbivore) title[i];
						System.out.println(her.getSpieces());
					}
				}

				System.out.println();
				break;

			case 7:
				v = false;

			}
		}

	} // 메인메소드 괄호

	public Animal(String spieces, int age, int weight, String eattype) {
		this.spieces = spieces;
		this.age = age;
		this.weight = weight;
		this.eattype = eattype;

	}

	public String getEattype() {
		return eattype;
	}

	public void setEattype(String eattype) {
		this.eattype = eattype;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSpieces() {
		return spieces;
	}

	public void setSpieces(String spieces) {
		this.spieces = spieces;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
} // Animal 괄호

class Carnivore extends Animal {

	public Carnivore(String spieces, int age, int weight, String eattype) {
		super(spieces, age, weight, eattype);
	}

} // Carnivore 괄호

class Herbivore extends Animal {

	public Herbivore(String spieces, int age, int weight, String eattype) {
		super(spieces, age, weight, eattype);
	}

} // Herbivore 괄호

interface Managable {
	void manage();
}

class Workers {
	String role;
	String name;

	public Workers(String role, String name) {
		this.role = role;
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

} // Worker 괄호

class Trainner extends Workers implements Managable {
	String whatanimal;

	@Override
	public void manage() {
		System.out.println(getName() + " 조련사가 담당하는 동물 : " + getWhatanimal());
	}

	public Trainner(String role, String name, String whatanimal) {
		super(role, name);
		this.whatanimal = whatanimal;
	}

	public String getWhatanimal() {
		return whatanimal;
	}

	public void setWhatanimal(String whatanimal) {
		this.whatanimal = whatanimal;
	}

} // Trainner 괄호

class Executive extends Workers {

	public Executive(String role, String name) {
		super(role, name);
	}

}
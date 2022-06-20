import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
//회원 관리 프로그램
// 회원 (클래스)
// 이름 , 키, 몸무게 (필드)
// 회원을 콘솔입력으로 등록할 수 있게 (최대 열명)
// 중복은 안됨, (키,이름,몸무게가 동일하면 중복)
// 기준에 따라 집계를 해서 목록을 보여주세요

// BMI 지수  - 몸무게 / 키제곱
// 고도비만 : 35이상
// 중도비만(2단계 비만) : 30이상 - 35미만
// 경도비만(1단계 비만) : 25 이상 - 30미만
// 과체중 : 23 이상 - 25 미만
// 정상 : 18.5 이상 - 23 미만
// 저체중 : 18.5 미만
// 키순으로 멤버 조회하기
class Weightrefree implements Comparator<Client> {
	
	@Override
	public int compare(Client o1, Client o2) {
		return o1.weight - o2.weight;
	}
}

class Client implements Comparable<Client> {
	public Scanner s = new Scanner(System.in);

	private String name;
	private double height;
	int weight;

	public Client(String name, double height, int weight) {
		this.name = s.nextLine();
		this.height = s.nextDouble();
		this.weight = s.nextInt();
	}

	@Override
	public int compareTo(Client a) {
		if (this.height < a.height) {
			return -1;
		} else if (this.height > a.height) {
			return 1;
		} else {
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void printClient() {
		System.out.println("이름 : " + name + ", 키 : " + height + ", 체중 : " + weight);
	}

	public double getBMI() {
		return getWeight() / (getHeight() * getHeight());
	}

	public double repBMI() {
		double bmi = getWeight() / (getHeight() * getHeight());

		if (bmi >= 35) {
			System.out.println("BMI : " + Math.round(bmi) + " (고도비만 입니다. 그만먹고 운동좀 하세요)");
		} else if (bmi >= 30) {
			System.out.println("BMI : " + bmi + " (중도비만 입니다. 님도 그만 드세요)");
		} else if (bmi >= 25) {
			System.out.println("BMI : " + bmi + " (경도비만 입니다. 조금만 드세요)");
		} else if (bmi >= 23) {
			System.out.println("BMI : " + bmi + " (과체중 입니다. 아직 괜찮아요)");
		} else if (bmi >= 18.5) {
			System.out.println("BMI : " + bmi + " (정상입니다.)");
		} else {
			System.out.println("BMI : " + bmi + " (멸치입니다. 운동하세요)");
		}
		return bmi;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name) && weight == other.weight;
	}

}

public class Main2 {
	public static void bmiTotal(Client[] a, int t) {
		Client[] copy = new Client[a.length];
		for (int i = 0; i < a.length; i++) {
			copy[i] = a[i];
		}
		if (copy[t].getBMI() >= 35) {
			System.out.println("고도 비만 : " + copy[t].getName());
		} else if (copy[t].getBMI() >= 30) {
			System.out.println("중도 비만 : " + copy[t].getName());
		} else if (copy[t].getBMI() >= 25) {
			System.out.println("경도 비만 : " + copy[t].getName());
		} else if (copy[t].getBMI() >= 23) {
			System.out.println("과체중 : " + copy[t].getName());
		} else if (copy[t].getBMI() >= 18.5) {
			System.out.println("정상 체중 : " + copy[t].getName());
		} else {
			System.out.println("멸치 : " + copy[t].getName());
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("회원 몇명을 등록하시겠습니깡");
		Client[] clients = new Client[s.nextInt()];

		System.out.println("등록하실 회원의 이름, 키(미터단위,소수점 둘째자리), 체중을 입력 해 주세요(동일입력 안됨)");
		for (int i = 0; i < clients.length; i++) {
			clients[i] = new Client(null, 0, 0);
			for (int k = 0; k < i; k++) {
				if (clients[k].equals(clients[i])) {
					clients[i] = null;
					System.out.println("중복이다, 다시 입력");
					System.out.println("등록하실 회원의 이름, 키(미터단위,소수점 둘째자리), 체중을 입력 해 주세요(동일입력 안됨)");
					i -= 1;
				} else {
					break;
				}
			}

		}
		
		Weightrefree comparator = new Weightrefree();
		

		System.out.println("등록이 완료되었습니다.");
		boolean b = true;
		while (b) {
			System.out.println("1. 회원 목록 보기 \n 2.회원 비만도 검사 \n 3.비만도 집계 \n 4.키순으로 정렬 \n 5.체중순으로 정렬");
			switch (s.nextInt()) {

			case 1:
				for (int i = 0; i < clients.length; i++) {
					System.out.println(clients[i].getName());
				}
				break;

			case 2:
				for (int i = 0; i < clients.length; i++) {
					System.out.println(clients[i].getName() + " , ");
					clients[i].repBMI();
				}
				break;
			case 3:
				for (int i = 0; i < clients.length; i++) {
					bmiTotal(clients, i);
				}
				break;

			case 4:
				Client[] clients2 = new Client[clients.length];
				for (int i = 0; i < clients.length; i++) {
					clients2[i] = clients[i];
				}

				Arrays.sort(clients2);
				for (int i = 0; i < clients2.length; i++) {
					System.out.println(clients2[i].getName());
				}
				break;
			case 5:
				Client[] clients3 = new Client[clients.length];
				for (int i = 0; i < clients.length; i++) {
					clients3[i] = clients[i];
				}
				
				Arrays.sort(clients3, comparator);
				
				for (int i = 0; i < clients3.length; i++) {
					System.out.println(clients3[i].getName());
				}
				break;
				
			}

		}
	}
}
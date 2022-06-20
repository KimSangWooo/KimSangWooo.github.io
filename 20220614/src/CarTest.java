class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {// 모든 객체 중 자동차 인것만 리턴시킴
			Car otherCar = (Car) obj;
			return model.equals(otherCar.model); // 판별 기준은 모델
		} else {
			return false;
		}
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car firstCar = new Car("MercedesS");
		Car secondCar = new Car("MercedesS");
		if (firstCar.equals(secondCar)) {
			System.out.println("같은 종류의 자동차입니다");
		} else {
			System.out.println("동일한 자동차가 아닙니다");
		}

	}

}

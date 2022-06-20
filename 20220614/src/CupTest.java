//컵라면 객체
// 제조사
//이름
//가격

class CupRamen {
	private String company;
	private String name;
	private int price;

	public CupRamen(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return company + ", " + name + ", " + price;
	}
	@Override
	public boolean equals(Object ram) {
		if (ram instanceof CupRamen) {
			CupRamen v = (CupRamen) ram;
			return this.company.equals(v.company) && name.equals(v.name);

		} else {
			return false;
		}
	}
	
	

}

public class CupTest {

	public static void main(String[] args) {
		CupRamen c1 = new CupRamen("오뚜기", "오징어짬뽕", 1200);
		CupRamen c2 = new CupRamen("오뚜기", "참깨라면", 1400);
	
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	
		if (c1.equals(c2)) {
			System.out.println("같은 라면");
		} else {
			System.out.println("다른 라면");
		}
	}

}

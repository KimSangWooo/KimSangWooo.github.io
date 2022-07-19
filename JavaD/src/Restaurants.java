
public class Restaurants {
	private int id;
	private String name;
	private String tellNum;
	private String address;

	public Restaurants (int id, String name, String tellNum, String address) {
		super();
		this.id = id;
		this.name = name;
		this.tellNum = tellNum;
		this.address = address;
	}
	
	public Restaurants (String name, String tellNum) {
		super();
		this.name = name;
		this.tellNum = tellNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTellNum() {
		return tellNum;
	}

	public void setTellNum(String tellNum) {
		this.tellNum = tellNum;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Restaurants [id=" + id + ", name=" + name + ", tellNum=" + tellNum + ", address=" + address + "]";
	}

	public static void main(String[] args) {
	
		
	}

}
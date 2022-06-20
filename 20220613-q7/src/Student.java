public class Student { // 부모
	String name;
	int snumber;
	String major;
	int level;
	int gradenum;

	public Student(String name, int snumber, String major, int level, int gradenum) {
		this.name = name;
		this.snumber = snumber;
		this.major = major;
		this.level = level;
		this.gradenum = gradenum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSnumber() {
		return snumber;
	}

	public void setSnumber(int snumber) {
		this.snumber = snumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getGradenum() {
		return gradenum;
	}

	public void setGradenum(int gradenum) {
		this.gradenum = gradenum;
	}

	public void printAll() {
		System.out.printf("%s, %2d, %s, %d, %d", getName(), getSnumber(), getMajor(), getLevel(), getGradenum());

	}

	public static void main(String[] args) {
		NowStu n1 = new NowStu("안톤 쉬거", 19, "추격", 2, 35, "미식축구");
		NowStu n2 = new NowStu("메이웨더", 02, "복싱", 3, 37, "미술");
		n1.printAll();
		n2.printAll();
		GraduatedStu g1 = new GraduatedStu("페이커", 14, "롤", 4, 77, "교육조교", 0.8);
		GraduatedStu g2 = new GraduatedStu("차이코프스키", 02, "작곡", 4, 80, "연구조교", 0.9);
		g1.printAll();
		g2.printAll();
	}

}

class NowStu extends Student { // 자식
	String club;

	public NowStu(String name, int snumber, String major, int level, int gradenum, String club) {
		super(name, snumber, major, level, gradenum);
		this.club = club;

	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public void printAll() {
		System.out.println("이름 : " + getName() + ", 학번 : " + getSnumber() + ", 전공 : " + getMajor() + ", 학년 : "
				+ getLevel() + ", 졸업학점 : " + getGradenum() + ", 동아리 : " + getClub() + "\n");
	}

}

class GraduatedStu extends Student { // 자식
	String asstype;
	double price;

	public GraduatedStu(String name, int snumber, String major, int level, int gradenum, String asstype, double price) {
		super(name, snumber, major, level, gradenum);
		this.asstype = asstype;
		this.price = price;
	}

	public String getAsstype() {
		return asstype;
	}

	public void setAsstype(String asstype) {
		this.asstype = asstype;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void printAll() {
		System.out.println("이름 : " + getName() + ", 학번 : " + getSnumber() + ", 전공 : " + getMajor() + ", 학년 : "
				+ getLevel() + ", 졸업학점 : " + getGradenum() + ", 조교 타입 : " + getAsstype() + ", 장학금 비율 : " + getPrice()
				+ "\n");
	}

}
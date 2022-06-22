import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
	private String title;
	private int price;

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Book o) { // 이름순 정렬을위한 추상메소드 재설정
		return title.compareTo(o.title);
	}

}

public class Main8 {

	public static void main(String[] args) {
		Book b1 = new Book("허클", 5000);
		Book b2 = new Book("허클", 5000);
		Book b3 = new Book("톰", 7000);
		Book b4 = new Book("논", 4000);

		Set<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		tree.add(b4);
		System.out.println(tree);

		Comparator<Book> com = new Comparator<Book>() { // 임의의 클래스 설정(가격 필드 순으로 정렬을 위함)
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};

		Set<Book> ptree = new TreeSet<>(com);
		ptree.add(b1);
		ptree.add(b2);
		ptree.add(b3);
		ptree.add(b4);

		System.out.println(ptree);

	}

}

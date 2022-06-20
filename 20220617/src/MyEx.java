import java.time.LocalTime;

public class MyEx extends Exception {
	public MyEx(String message) {
		super(message + ", " + LocalTime.now() + "에 발생하였음");
	}
}

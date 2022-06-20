import java.util.StringTokenizer;

public class Main3 {

	public static void main(String[] args) {
		String LongLine = "apple banana carrot donut";
		
		StringTokenizer st = new StringTokenizer(LongLine, " ");
		int i = 0;
		while (st.hasMoreTokens()) {
			st.nextToken();
			i++;
			if (i == 2) {
				System.out.println(st.nextToken());
			}
		}
	}

}

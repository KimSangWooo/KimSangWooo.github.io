import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Q2577 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int v = a * b * c;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		String t = Integer.toString(v);
		char [] arr = new char[t.length()];
		for (int i = 0; i < t.length(); i++) {
			arr[i] = t.charAt(i);
			switch (arr[i]) {
			case ('0') :
				count0++;
			break;
			
			case ('1') :
				count1++;
			break;
			
			case ('2') :
				count2++;
			break;
			
			case('3') :
				count3++;
			break;
			
			case('4') :
				count4++;
			break;
			
			case('5') :
				count5++;
			break;
			
			case('6') :
				count6++;
			break;
			
			case('7') :
				count7++;
			break;
			
			case('8') :
				count8++;
			break;
			
			case('9') :
				count9++;
			break;
			}
		}
		System.out.println(count0);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);
	
	}

}
package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화하기
// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
// 위의 리스트의 원소들을 모두 다 가지는 리스트
// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 복사리스트
public class Main7 {

	public static void main(String[] args) {
		List<Integer> two = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		
		List<Integer> seven = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
		
		List<Integer> all = new ArrayList<>(seven);
		all.addAll(0, two);
		System.out.println(all);
		
		Collections.sort(all);
		System.out.println(all);
		

	}

}

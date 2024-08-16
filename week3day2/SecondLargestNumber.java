package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] a = {3, 2, 11, 4, 6, 7};
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			b.add(a[i]);
		}
		Collections.sort(b);
		int size = b.size();
		
		System.out.println(b.get(size-2));
		
	}

}

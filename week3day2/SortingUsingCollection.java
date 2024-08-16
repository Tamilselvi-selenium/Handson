package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] a = {"HCL", "Wipro","Aspire Systems", "CTS"};
		List<String> n = new ArrayList<String>();
		for (int i = 0; i < a.length; i++) {
			n.add(a[i]);
			
		}
		Collections.sort(n);
		for (int j =a.length-1; j>=0; j--) {
			
		}
		Collections.reverse(n);
System.out.println(n);
	}

}

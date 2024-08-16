package week3day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=i+1) {
				System.out.println((i+1));
			}
		}
	}

}

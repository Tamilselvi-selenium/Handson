package week1day2;

import java.util.Arrays;

public class MatchingArray {

	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7}; 
		 int[] b= {1,2,8,4,9,7};
		 Arrays.sort(a);
		 // 2 3 4 6 7 11
		 Arrays.sort(b);
		 // 1 2 4 7 8 9 
		 for (int i = 0; i < a.length-1; i++) {
			 for (int j = 0; j < b.length-1; j++) {
					
					if(a[i]==b[j]) {
						System.out.println("Matching Array is "+ b[j]);
					}
				}
			}
	}

}

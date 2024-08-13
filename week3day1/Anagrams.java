package week3day1;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 ="potss";
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		for(int i=0; i<charArray1.length; i++) {
		if (charArray1[i]!=charArray2[i]) {
			System.out.println("Given String are not  Anagrams");
		} 
		
	}
		System.out.println("Given String are Anagrams"); 
	}
} 
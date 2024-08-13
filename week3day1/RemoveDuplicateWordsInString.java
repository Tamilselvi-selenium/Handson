package week3day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {
		String text1="We learn Java basics as part of java sessions in java week1";
		String lowerCase = text1.toLowerCase();
		String[] split = lowerCase.split(" ");
		String n ="";
		Set<String> name = new LinkedHashSet<> ();
		for (String s : split) {
			name.add(s);
		}
		for (String s1 : name) {
			n +=s1;
		}
		System.out.println(n);
	}

}

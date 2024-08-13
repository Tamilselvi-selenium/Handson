package week3day1;

public class ChangeOddIndexOfGivenStringToUpperCase {

	public static void main(String[] args) {
		String text1 = "changeme";
		char[] charArray = text1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = text1.charAt(i);
		if(i%2!=0)	{
			c=Character.toUpperCase(c);
			}
			System.out.print(c);
		}
	}
}
 
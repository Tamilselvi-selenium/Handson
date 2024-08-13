package week3day1;

public class ReverseOddWordInString {

	public static void main(String[] args) {
		String name = "I am a software tester";
		String text ="";
		String[] split = name.split(" ");
		//String text1="";
		for (int i = 0; i <= split.length-1; i++) { 
			if(i%2!=0) {
				char[] charArray = split[i].toCharArray();
				for (int j=charArray.length-1; j>=0; j--) {
				System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}else if(i%2==0) {
				System.out.print(split[i] +" ");
			}
		}
 
	} 

}

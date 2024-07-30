package week1day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] num= {1, 4,3,2,8, 6, 7};
		
		Arrays.sort(num);
		//1 2 3 4 6 7 8
		for(int i=0;i<num.length;i++) {
			//num[i]=1 2 3 4 6 7 8
			//     i=0 1 2 3 4 5 6
			if(num[i]!=i+1) {
				System.out.println("Missing number is " + (i+1));
				break;
				//if we didnt give break it will continue to check all num[i] with i. 
			}
		}
	}

}

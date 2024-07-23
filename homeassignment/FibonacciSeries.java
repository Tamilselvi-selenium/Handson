package week1.day1.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 
		// a b c 
		//   a b c 
		//     a b c 
		
		int a=0;
		int b=1;
		// to print value of a and b give in syso
		System.out.println(a);
		System.out.println(b);
		int c;
		for(int i=0;i<6;i++) {
			// i<6 we need to print 6 numbers 
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		

	}

}

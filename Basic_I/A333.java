import java.util.*;

public class A333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No: ");
		long n = sc.nextLong();
		
		 System.out.println("The sum of the digits is: " + sumDigits(n));

	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
			//System.out.println(n);
		}
		return sum;
		
	}

}

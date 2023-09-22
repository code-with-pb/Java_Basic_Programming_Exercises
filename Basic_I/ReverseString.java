import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		char [] a = sc.nextLine().toCharArray();
		
		System.out.print("Reverse String: ");
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}

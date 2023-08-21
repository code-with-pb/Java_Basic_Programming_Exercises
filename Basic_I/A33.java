import java.util.*;

public class A33 {
	public static void main(String args[]) {
		int[] a = new int[5];
		int s = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			System.out.print("Enter No: ");
			a[i] = sc.nextInt();
		}
		int b = String.valueOf(a).length();
		
		for (int i=0;i<2;i++) {
			s = s + a[i];
		}
		System.out.println(s);
	}
}

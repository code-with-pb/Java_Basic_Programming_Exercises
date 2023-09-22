import java.util.*;

public class AddTwodigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No: ");
		int n = 0;
		
		int a [] = new int[2];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			n =  n+a[i];
		}
		System.out.println(n);
		
		
	}

}

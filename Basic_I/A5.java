import java.util.*;

public class A5 {
	
	void cal(int x, int y) {
		System.out.println(x*y);
		
	}
	public static void main(String [] args) {
		A5 o = new A5();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input First No: ");
		int a = sc.nextInt();
		System.out.print("Input Second No: ");
		int b = sc.nextInt();
		
		o.cal(a,b);
	}
}

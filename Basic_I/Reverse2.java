import java.util.*;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = 0;
		
		while(n !=0) {
			int r = n %10;
			s = s*10 + r;
			n /=10;
		}
		System.out.println(s);
	}
}

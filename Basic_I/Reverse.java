import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 231;
		int r = 0;
		int n = 0;
		while (a!=0) {
			r =a%10;
			n = n*10+r;
			a /=10;
		}
		System.out.print(n);
		
	}

}

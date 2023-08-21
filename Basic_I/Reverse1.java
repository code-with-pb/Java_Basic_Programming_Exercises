
public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 123456789;
		int r = 0;
		int d = 0;
		while (s!=0) {
			r = s%10;
			d = d*10+r;
			s/=10;
		}
		System.out.print(d);
	}

}

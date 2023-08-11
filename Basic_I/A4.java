import java.util.Scanner;

public class A4 {
	void sp() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose operation 1) 2) 3) 4)");
		
		for (int j = 1; j < 5; j++) {
		
			int i = sc.nextInt();
			
			switch(i) {
				case 1: 
					System.out.println(-5+8*6);
					break;
				case 2:
					System.out.println((55+9)%9);
					break;
				case 3:
					System.out.println(20+(-3*5)/8);
					break;
				case 4:
					System.out.println(5 + 15 / 3 * 2 - 8 % 3);
					break;
				default :
					System.out.println("Choose correct No");
					break;
			}
		}
	}
	public static void main(String args[]) {
		A4 o = new A4();
		o.sp();
	}
}

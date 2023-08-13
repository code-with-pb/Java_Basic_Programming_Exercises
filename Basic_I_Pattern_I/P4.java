
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = 5;
		
		for(int i = 0;i<s;i++) {
			for(int j=1;j<s-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

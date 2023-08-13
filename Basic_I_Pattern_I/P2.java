
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 5;
		for (int i=0;i<s;i++) {
			for (int j=0; j<s;j++) {
				 if (i == 0 || i == s - 1) {
			          System.out.print("*");
				 }
				 else {
				       // print star only at first and last position row
					 if (j == 0 || j == s- 1) {
				         System.out.print("*");
				       }
				      else {
				         System.out.print(" ");
				      }
				 }
			}
			
			 System.out.println();
		}

	}

}

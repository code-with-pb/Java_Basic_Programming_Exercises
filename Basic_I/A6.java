import java.util.*;

public class A6 {
	void Ss() {
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st No: ");
		a = sc.nextDouble();
		System.out.print("Enter 2nd No: ");
		b = sc.nextDouble();
		
		System.out.println("choose 1)Addition 2)Substraction 3)Devide 4)Reminder");

		int n = sc.nextInt();
		
		do{

			switch(n) {
				case 1: System.out.println("Additon of Two Number: "+(a+b));
				case 2: System.out.println("Substraction of Two Number: "+(a-b));
				case 3: System.out.println("Dividing of Two Number: "+(a/b));
				case 4: double c = a % b;
						System.out.println("Reminder of Two Number: "+c);
				default :
					System.out.println("Choose Correct value");
					break;
			}
		}while (n == 5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 o  = new A6();
		
		o.Ss();
	}

}

import java.util.*;
public class question_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		int a1 = a;
		int b1=b;
		
		// (GCD) of two numbers using Euclid's algorithm
		
		do {
			int gcd = a%b;
			a=b;
			b=gcd;
		}while(b!=0);
		System.out.println("GCD of "+a1+ " and "+b1+" is: "+a );
		
		/*whie(b!=0){
		 * 	int gcd = a%b;			//in while loop
		 * 	a=b;
		 * 	b=gcd;*/
	}

}

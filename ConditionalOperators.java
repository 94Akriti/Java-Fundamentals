
package Project1;
import java.util.Scanner;
public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > b) {
			System.out.println("1st number is greater than second one");
		}
		else {
			System.out.println("second number is greater than 1st one");
		}
		System.out.println("outside if");

	}

}

package Project1;
import java.util.Scanner;
public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Scanner sc = new Scanner(System.in); 
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > b) {
			System.out.println("1st number is greater then second one");
		}else {
			if(b > a) {
			System.out.println("2nd is greater");
			}else {
				System.out.println("both are equal");
			}
		}
		
		if(a > b) {
			System.out.println("1st number is greater then second one");
		}
		
		else if(a < b) {
			System.out.println("2nd number is greater then 1st one");
		}
		
		else {
			System.out.println("both are equal");
		}
	}

}

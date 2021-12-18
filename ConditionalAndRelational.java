package Project1;

import java.util.Scanner;

public class ConditionalAndRelational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > 0 && b > 0) {
			System.out.println("both are positive");
		}else {
			System.out.println("Both are not positive");
		}
		System.out.println();
		//if(a > 0 || b > 0) {
		//	System.out.println("one is positive");
		//}else {
		//	System.out.println("None is positive");
		//}
		
		if(a * b < 0) {
			System.out.println("one is negative");
		}else {
			System.out.println("both positive or both negative");
		}
		
		System.out.println();
		
		if(a == b ) {
			System.out.println("both equal");
		}else {
			System.out.println("Both are not equal");
		}
	}

}

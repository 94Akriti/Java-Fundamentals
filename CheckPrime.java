package Project1;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();

		int d = 2;
		boolean isPrime = true;
		while(d < a) {
			if( a % d ==0) {
				isPrime = false;
			}
			d+=1;
		}
		
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Composite");
		}
	}

}

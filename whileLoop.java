package Project1;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			System.out.println("Hello" + " player"+i);
			i += 1; // to prevent infinite loop
		}
	}

}

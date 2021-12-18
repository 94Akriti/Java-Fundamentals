package Project1;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		// int rem = a % 2;
		
		// boolean result = rem == 0;
		if(a % 2 == 0) {
			System.out.println(a + " is even");
		}else {
			System.out.println(a + " is odd");
		}
		
		// if without else possible but not converse of it
	}

}

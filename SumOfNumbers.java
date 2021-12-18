package Project1;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n= sc.nextInt();
		int sum=0,i=1;
		while(i <= n) {
			sum += i;
			i += 1;
		}
		System.out.println(sum);
	}
}

package Project1;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// post increment/decrement: a++/a--
		// pre increment/decrement: ++a/--a
		int a = 60;
		// a = a + 1
		// a += 1;
		// a++
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		int x = 60, y = 80;
		if (x++ > 60 && y++ > 80) {
			System.out.println("inside if");
		}else {
			System.out.println("inside else");
		}
		System.out.println("num1: " + x + " num2: " + y);
		
		//Post increment
		int x2 = 60, y2 = 80;
		if (++x2 > 60 && y2++ > 80) {
			System.out.println("inside if");
		}else {
			System.out.println("inside else");
		}
		System.out.println("num1: " + x2 + " num2: " + y2);
		
		//Post increment using or
		int x3 = 60, y3 = 80;
		if (++x3 > 60 || y3++ > 80) {
			System.out.println("inside if");
		}else {
			System.out.println("inside else");
		}
		System.out.println("num1: " + x3 + " num2: " + y3);
	}

}

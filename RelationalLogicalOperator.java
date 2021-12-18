package Project1;

public class RelationalLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Relation operators
		int a=30, b =10;
		
		System.out.println("Relational operators");
		System.out.println( a > b );
		System.out.println( a < b );
		System.out.println( a == b );
		System.out.println( a != b );
		System.out.println( a >= b );
		System.out.println( a <= b );
		System.out.println();
		System.out.println("Logical Operators");
		// Logical Operators
		// true && true = true
		// true && false = false
		// false && true = false
		// false && false = false
		
		System.out.println( a >= 10 && b > 10);
		// false || false = false
		// true || false = true
		// false || true = true
		// true || true = true
		
		System.out.println( a >= 10 || b > 10);
		
		System.out.println(!true); // (!( a > b ))
		System.out.println(!false); // (!(a < b ))
	}

}

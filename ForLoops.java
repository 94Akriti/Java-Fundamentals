package Project1;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		//int i = 1;
		//while(i <= n){
		//		System.out.println(i);
		//		i++;
		//}
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
		//System.out.println(i);
		
		//Multiple declarations: use logical in conditional block
		for(int i1 = 1, j1 = 100; i1 <= n && j1 <= 200; i1++, j1+=20) {
			System.out.println(i1 + " "+ j1);
		}
		
		//Nested for loops
		for(int i2 = 1; i2 <= n; i2++) {
			for(int j2 = 1; j2 <= 4; j2++) {
			System.out.println("i = " + i2 + " j = " + j2);
			}
		}
	}

}

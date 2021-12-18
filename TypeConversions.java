package Project1;

public class TypeConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		System.out.print("Addition with single quotes is like char asquii addition to the int ");
		System.out.println('a'+1);
		//char to int conversion
		char c ='a';
		int i = c;
		System.out.println("char to int " +i);
		
		// int to char conversion
		c= (char)i;
		c = (char)(c+1);
		System.out.println("int to char " + c);
		
		// short to int 
		short s = 10;
		int j = s;
		s = (short)j;
		System.out.println("int to short "+s);
		int k = (int)10.7;
		System.out.println("short to int "+k);
		
		//float representation
		float f = 1.7f; // (float)1.7
		System.out.println("int to float "+f);
		
		System.out.println("");
		//Basic multiplication and division of diff datatypes
		System.out.println("Some basic operations on different datatypes");
		// int + int = int
		System.out.println(4+4);
		
		//int +double = double
		System.out.println(4+4.4);
		
		// double + doubel =double
		System.out.println(4.5+4.5);
		
		//division
		System.out.println(2.0/5);
	}

}

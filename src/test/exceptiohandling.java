package test;

public class exceptiohandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int i =0;
			
		 int j = 4/i;
		 
		 System.out.println("Hi");
		 System.out.println("j value"+j);
		 
		}
		
		catch (ArithmeticException e){
			
			System.out.println("divide by zero");
			
		}
		
		System.out.println("Hello");

	}

}

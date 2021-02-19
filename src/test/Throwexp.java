package test;

public class Throwexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int age = 19;
			
			if(age<18) {
				throw new ArithmeticException("not valid");
			}
			else {
				System.out.println("Welcome voter");
			}
		}
			catch( Exception e) {
				
				System.out.println("Exception handled");
			}
		}
	}



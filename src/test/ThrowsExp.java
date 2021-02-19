package test;

import java.io.IOException;

public class ThrowsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsExp obj = new ThrowsExp();
		
		try {
			obj.m1();
			
			}catch (IOException e) {
			System.out.println("Exception occured");
		}

		
	}

		void m1() {
			try {
				int age = 19;
				
				if(age<18) {
					throw new ArithmeticException("not valid");
				}
				else {
					System.out.println("Welcome voter");
				}
			
				}
}
}
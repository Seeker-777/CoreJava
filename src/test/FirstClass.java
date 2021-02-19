package test;

import test1.ThirdClass;

public class FirstClass {
	
	int age;
	String Name;
	float salary;
	
	public void Display() {
		
		System.out.print("Inside Display");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("within main");
		
		SecondClass obj1 = new SecondClass();
		obj1.show("Arun");
		
		SecondClass obj2 = new SecondClass();
		obj2.show("sam");
		
		ThirdClass obj3 = new ThirdClass();
		obj3.calculate("ashok");
		

	}

}

package test;

public abstract class ParentClass {
	
	int Empno = 707;
		
		public void display() {
			System.out.println("Emplyee num"+Empno);
		}
		
		abstract void run();
		abstract void horn();

}

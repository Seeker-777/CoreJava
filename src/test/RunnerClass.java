package test;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass objchild = new ChildClass();
		ParentClass objparent =new ParentClass();
		GrandChild objGRchild =new GrandChild();
		
		objchild.show();
		objchild.display();
		objGRchild.calculate();

	}

}

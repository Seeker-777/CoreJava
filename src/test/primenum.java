package test;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		int count=0;
		
		for(int i=n;i>0;i--)
		{
			if(n%i==0)
			{
				count++;
		
			}
		}	
			if(count==2)
			{
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		

	}

}

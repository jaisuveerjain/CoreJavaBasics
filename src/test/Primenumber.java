package test;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10,i;
		int count=0;
		
		if(n==0 || n==1) {
			System.out.println("It is not a prime number");
		}
		
		
		for(i=n;i>0;i--) {
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count == 2)
		{
			System.out.println("number is prime");
		}
	}

}

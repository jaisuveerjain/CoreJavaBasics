package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Trying to commits
		
		try {
			int age =11;
			if (age<18) {
				throw new ArithmeticException("not valid");
				
			}
			else {
				System.out.println("welcome to vote");
			}
		}catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}

	}

}

package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//int i = 0;
			//int j= 10/i;
			
			System.out.println("Hi Jai");
			
			
		}catch (ArithmeticException e) {
			System.out.println("We cant divide any number by zero");
		}
		
		catch (Exception e) {
			System.out.println("Other exception");
		}
		
		System.out.println("After Exception");

	}

}

package test;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("OUTPUT OF WHILE LOOP");
		while(i<5) {
			System.out.println("Value of i is " +i);
			i=i+1;
		}
		
		
		int j= 0;
		System.out.println("OUTPUT OF DO WHILE LOOP");
		do {
			System.out.println("Value of j is " +j);
			j=j+1;	
		}while(j<5);
		
		
		int k=0;
		System.out.println("OUTPUT OF FOR LOOP");
		for(k=0;k<5;k++) {
			System.out.println("Value of k is "+k);
			
		}
	}

}

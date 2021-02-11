package test;

import test2.ThirdClass;

public class FirstClass {
	int age;
	String name;
	float Salary;

		public void Display() {
			System.out.println("Inside Display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		SecondClass Obj1 = new SecondClass();
		Obj1.Show("Rahul");
		SecondClass Obj2 = new SecondClass();
		Obj2.Show("Manjunath");
		Obj2.Calculate();
		ThirdClass Obj3 = new ThirdClass();
		Obj3.Show("Suveer");
		
		
	}

}

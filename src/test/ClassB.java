package test;

public class ClassB {
	String myName;

	public ClassB() {
		System.out.println("Inside clss B constuctor");
	}
	
	
	public ClassB(String Name) {
		System.out.println("Inside clss B param constuctor");
		System.out.println("Name is :" +Name);
		
		myName = Name;
	}	
}

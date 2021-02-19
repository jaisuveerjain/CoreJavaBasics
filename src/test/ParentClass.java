package test;

public abstract class ParentClass {
	
int EmpNo=11;
	
	public void Display() {
		System.out.println("Emp No:"+EmpNo);
	}
	
	
	abstract void run();
	abstract void horn();
}

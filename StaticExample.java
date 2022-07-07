package DefinitionExample;

public class StaticExample {
	static public void checkstatic() {
		System.out.println("no need to create objects");
	}
	public void checkNormal() {
		System.out.println("must create object");
	}
	public static void main(String[]args) {
		
		checkstatic();
		
		StaticExample s= new StaticExample();
		s.checkNormal();
	}

}

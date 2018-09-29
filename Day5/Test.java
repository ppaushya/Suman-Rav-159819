package org.capgemini.com;

public class Test implements TestInterface {

	

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("Division method overloaded in class");
	}

	@Override
	public void modules() {
		// TODO Auto-generated method stub
		System.out.println("Modules method overloaded in class");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.division();
		t.modules();
		
	}

}

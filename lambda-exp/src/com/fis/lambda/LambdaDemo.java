package com.fis.lambda;

interface A
{
	void show(String name);
}

/*
 * class Xyz implements A //instead of this we can define methods in interface
 * below {
 * 
 * @Override public void show() { System.out.println("Hello Akhilesh!!!"); } }
 */

public class LambdaDemo {

	private static final String Rutvik = null;

	public static void main(String[] args) 
	{
		
//		A obj = new A() //Anonymous class
//				{
//					public void show() 
//					{ 
//						System.out.println("Hello Akhilesh!!!");
//					}
//				};
		
		A obj = (name) -> System.out.println("Hello "+name); //lambda exp
		
		obj.show("Rutvik");
	}

}

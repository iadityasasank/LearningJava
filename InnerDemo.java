package com.aditya;

///3 classes in the program--> InnerDemo,outer,inner
class outer{
	int a; //Variable
	public void show() //method 
	{
		
	}
	
	class Inner //In outer class we can create class
	{//This class can be a static class
		public void display() {
			System.out.println("In Display");
		}
	}
}

public class InnerDemo {
	
	//Inside a class we can create a vairable, method, 

	public static void main(String[] args) {
		outer n =  new outer() ; //Here 'n' is the Object for 'Outer' class and 'outer()' is constructor
		n.show();
		
		outer.Inner n2 = n.new Inner(); //This is the way we create object for inner classes
		n2.display();
	}

}

// In this we have 3 classes 1. InnerDemo 2. Outer and 3. Inner; so this file has 3 class files
// The 3 class name will be saved as 1.InnerDemo.class 2. Outer.class and 3.Outer$Inner.class	
// Similar to static method, static variables we will also have Static inner classes
// Inner class will be 3 types 1. Member Class(Non-Static) 2. Static Class 3.Annonymous(We can understand after Interfaces and Abstract Classes Concepts) )
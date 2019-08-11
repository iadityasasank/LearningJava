package com.aditya;

class Para{
	int eid;
	static int salary;
	String name;
	
	static//Used for assigning static variable 
	{
		salary = 12500;
	}
	
	public Para()
	{
		eid = 0;
		name = "xxxx";
	}
	public void data() {
		System.out.println("Name : "+name+" ; Salary : "+salary+" ;Emp ID : "+eid);
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		Para n1 = new Para();
		Para n2 = new Para();
		Para n3 = new Para();
		n1.name = "Aditya Sasank";
		n1.eid = 488;
		n1.salary = 10500;		

		n2.name ="Narayana";
		n2.eid = 489;
		Para.salary = 12500; //here static keyword makes salary same for all objects
		// for static variable we can call them with class name instead of 
		
		n2.salary=15000;
		
		
		n1.data();
		n2.data();
		n3.data();
	}

}

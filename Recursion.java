import java.util.Scanner;

public class Recursion {
	
	//Base Case and Recursion Case
	
	
	public static int Summation(int x) {
		//Base Case
		if(x<=0)
		{
			return 0;
		}
		//Recursion Case
		else
		{
			return x+ Summation(x-1);
		}
	}
	
	public static int Exponentiation(int x,int y) {
		//Base Case
		if(y==0)
		{
			return 1;
		}
		
		if(y<0)
		{
			System.out.println("Enter positive number only!");
			return 0;
		}
		//Recursion Case
		else {
			
			return x * Exponentiation(x,y-1);
		}

			
		}
	
	
	public static int Factorial(int x) {
			//Base Case
			if(x<=1)
			{
				return 1;
			}
			//Recursion Case
			else
			{
				return x * Factorial(x-1);
			}
	}
		
		
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter your Choice : ");
		
		System.out.println("** S = SUMMATION ; F = Factorial ; E =Exponentiation**");
		
		char C = num.next().charAt(0);
		
		
		
		switch(C){
		
		case 'S':
			int n;
			System.out.print("Enter the number : ");
			n =num.nextInt();
		
			int a = Summation(n);
			System.out.println("Summation of "+n+" = "+a);
			break;
		
		case 'F':
			System.out.print("Enter the number : ");
			n =num.nextInt();
			a = Factorial(n);
			System.out.println("Factorial of "+n+" = "+a);
			break;
			
		case 'E':
			System.out.print("Enter the number : ");
			n =num.nextInt();
			System.out.println("Enter the exponent : ");
			int x = num.nextInt();
			a = Exponentiation(n,x);
			System.out.println("Exponential of give numbers "+n+" = "+a);
			
		default :
			System.out.println("Wrong Input !! Should have entered any one of S or F or E");
			
		}
	}
}



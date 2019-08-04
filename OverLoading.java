class Calc
{
	int x1, x2;
	String demo;

	public Calc()
	{
		x1 = x2 = 0;
		demo = "Nothing";
	}
	public Calc(int i)
	{
		x1 = i;
		x2 = 5;
		demo = "Input plus 5";

	}
	public Calc(int i,int j)
	{
		x1 = i;
		x2 = j;
		demo = "Addition";
	}
	public Calc(int i, int j, String in)
	{
		x1 = i;
		x2 = j;
		demo = "Addition";
	}
	public void add(int m, int a)
	{
		System.out.println(m+a);
	}

	public void add(double m, double a)
	{
		System.out.println(m+a);
	}

	public void add(int n1, int n2, int j)
	{
	
	int  result = n1 + n2 + j;
	System.out.println(result);
	}

}

public class OverLoading
{
	public static void main(String[] args)
	{
	 Calc a = new Calc();
	 Calc b = new Calc(0);//Constuctor Overloading
	 Calc c = new Calc(4,5);//Constuctor Overloading
	 Calc d = new Calc(5,6,"Add");//Constuctor Overloading

	 a.add(7,99); //Method Overloading

	 a.add(6,55,3); //Method Overloading

	 a.add(4.44,5.55); //Method Overloading



	}
}
	
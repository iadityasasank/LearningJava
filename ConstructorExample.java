class Calc
{
	int n1,n2,result;
	
	public Calc()
	{
		System.out.println("Oops !");
	}

	public Calc(int n)
	{
	n1 = n;
	n2 = n;
	result = n1 + n2;
	System.out.println(result);
	}

}

public class ConstructorExample
{
	public static void main(String[] args)
	{
	Calc obj = new Calc(); //Default Constructor
	Calc a = new Calc(3);

	
	}
}
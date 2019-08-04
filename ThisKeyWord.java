class Calc
{
	int n1,n2,result;
	
	public Calc()
	{
		System.out.println("Oops !");
	}

	public Calc(int n1, int n2)
	{
	this.n1 = n1; //if the variable name is same then we should use THIS key word
	this.n2 = n2;
	result = n1 + n2;
	System.out.println(result);
	}

}

public class ThisKeyWord
{
	public static void main(String[] args)
	{
	Calc obj = new Calc(); //Default Constructor
	Calc a = new Calc(3, 5);
	}
}
	
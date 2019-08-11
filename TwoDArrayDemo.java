package com.aditya;

public class TwoDArrayDemo {

	public static void main(String[] args) 
	{
		
		int a[] = {1,2,3,4};
		int b[] = {11,22,33,44};
		int c[] = {111,222,333,444};
		
		int d[][] = {
				{1,2,3,4},
				{11,2,33,4},
				{1,22,3,44}
					};
		
		for(int i=0; i<4;i++)//row
		{
			System.out.print(d[1][i]+" "); //2st row as 1 index 
		}
		System.out.println(" ");
		for(int i=0; i<3;i++)//column
		{
			System.out.println(d[i][0]); //1st column as 0 index
		}
		
		for(int i=0; i<d.length;i++) // Matrix or the total 2d Array
		{
			for(int j=0; j<d[i].length;j++) 
			{
				System.out.print(d[i][j]+" ");				
			}
			System.out.println(" ");
		}
		
	}

}

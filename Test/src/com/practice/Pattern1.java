package com.practice;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int n=1;
		for(int i=1;i<=5;i++)
		{

			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(n!=15)
				{
				System.out.print(n++ +" ");
			}
			}
			System.out.println();
		
		}

	}	

}

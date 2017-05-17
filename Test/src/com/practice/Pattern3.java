package com.practice;

public class Pattern3 {

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=4;i++)
		{
			char c='A';
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(c++);
			}
			
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(c);
			}
			System.out.println();
		}

	}

}

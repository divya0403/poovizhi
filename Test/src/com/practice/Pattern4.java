package com.practice;

public class Pattern4 {

	public static void main(String[] args)
	{
		int n=5;
		int spc=n-1;
		int asc=65;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=spc;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=asc+i-1;j>=65;j--)
			{
				System.out.print((char)j);
			}
			for(int j=(asc+1);j<=asc-1+i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
			
			
	}

	}
	}

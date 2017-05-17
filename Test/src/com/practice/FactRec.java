package com.practice;

public class FactRec {

	public static void main(String[] args) 
	{
		System.out.println(test(5));
	}
	
	public static int test(int n)
	{
		int fact=n;
		if(n<=0)
		{
			return 1;
		}
		else
		{
			fact=fact*test(n-1);
		}
		return fact;
	}

}

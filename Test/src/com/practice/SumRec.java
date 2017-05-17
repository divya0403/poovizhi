package com.practice;

public class SumRec {

	public static void main(String[] args) 
	{
		
		System.out.println(sum(10));
	}
	public static int sum(int n)
	{
		int j=n;
		if(n>0)
		{
			j=j+sum(n-1);
		}
		return j;
	}
	
}

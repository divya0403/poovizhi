package com.practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	String msg="is A Prime Number";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter A Number To Check");
	int n= in.nextInt();
	if(n<2)
	{
	
		msg="Not A Prime Number";
	}
	else
	{
	for(int i=2;i<=n/2;i++)
	{
		
		if(n%i==0)
		{
			msg="Not A Prime Number";
			break;
		}
	}

	}
	System.out.println(msg);
	}
	
}

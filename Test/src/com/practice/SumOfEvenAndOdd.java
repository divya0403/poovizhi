package com.practice;

import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A Number To Check");
		int n= in.nextInt();
		int sumOfOdd=0;
		int sumOfEven=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sumOfEven=sumOfEven+i;
			}
			else
			{
				sumOfOdd=sumOfOdd+i;
			}
		}
		
		System.out.println("Sum of even : "+sumOfEven);
		System.out.println("Sum of odd : "+sumOfOdd);
		
	}

}

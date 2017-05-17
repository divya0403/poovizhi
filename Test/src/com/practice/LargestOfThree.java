package com.practice;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int n1= in.nextInt();
		System.out.println("Enter 2nd Number");
		int n2= in.nextInt();
		System.out.println("Enter 3rd Number");
		int n3= in.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("Greatest no is :"+ n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Greatest no is :"+ n2);
		}
		else
		{
			System.out.println("Greatest no is :"+ n3);
		}

	}

}

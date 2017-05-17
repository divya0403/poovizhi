package com.practice;

public class SplChar {

	public static void main(String[] args) 
	{
	String str="Welcome to tyss";
	String s="";
	char [] c =str.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(c[i] =='t')
		{
			s=s+c[i];
			s=s+'@';
		}
		else if(c[i]=='e')
		{
			s=s+c[i];
			s=s+'#';
		}
		else
		{
			s=s+c[i];
			
		}
	}
	System.out.println(s);
	}
}

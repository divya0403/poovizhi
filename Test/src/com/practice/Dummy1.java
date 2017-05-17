package com.practice;

public class Dummy1 {

	public static void main(String[] args) 
	{
		String s="sathishvasusamiyappan";
		char [] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]=' ';
				}
			}
			
		}
		String s1=new String(c);
		System.out.println(s1.replace(" ", ""));
	}

}

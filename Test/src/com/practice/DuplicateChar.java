package com.practice;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		String s="sathishvasusamiyappan";
		boolean flag=false;
		String duplicates="";
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					flag=true;
					ch[j]=' ';
				}
			}
			if(flag)
			{
				duplicates= duplicates+ch[i];
				flag=false;
			}
		}
		System.out.println(duplicates.replace(" ", ""));

	}

}

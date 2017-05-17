package com.practice;

import java.util.Scanner;

public class FirstRepeat 
{
	
	
	public static void main(String[] args) 
	{
		String s = new Scanner(System.in).nextLine();
		boolean flag = false; 
		char [] ch=s.toCharArray();
	    String dup = "";
	
	for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				
				if(ch[i]==ch[j])
				{
					flag = true;
					ch[j]=' ';	
				}
				
			}
			if(flag)
			{
				dup=dup+ch[i];
				flag = false;
				
			}
			}
	System.out.println(dup.replace(" ", ""));
	System.out.print(dup.replace(" ", "").charAt(0));
			
		}

	}



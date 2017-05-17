package com.practice;

import java.util.Scanner;

public class DiamondPattern {
	
	public static void main(String[] args)
	{
	       int n=4;
	      int  space = n-1;
	        for(int k=1; k<=n; k++)
	        {
	            for(int c=1; c<=space; c++)
	            {
	                System.out.print(" ");
	            }
	            space--;
	            for(int c=1; c<=(2*k-1); c++)
	            {
	                System.out.print(c);
	            }
	            System.out.println();
	        }		
	        space = n-3;
	      for(int k=1; k<=(n-1); k++)
	        {
	            for(int c=1; c<=space; c++)
	            {
	                System.out.print(" ");
	            }
	            space++;
	            for(int c=1; c<=(2*(n-k)-1); c++)
	            {
	              if(c==1 || c== (2*(n-k)-1))
	              {
	                System.out.print("1");
	              }
	              else
	              {
	            	  System.out.print(" ");
	              }
	            }
	            System.out.println();
	        }
	}
}
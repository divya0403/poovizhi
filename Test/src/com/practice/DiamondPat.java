package com.practice;

public class DiamondPat {

	public static void main(String[] args)
	{
		 int size = 11,str = 1, spc = size/2; int asci=65;
		 
	        for (int i = 1; i <= size; i++)
	        { 
	            for (int k = spc; k >= 1; k--)
	            {
	                                                
	                System.out.print(" ");
	            }
	            
	            for (int j = 1; j <= str; j++) 
	            { 
	            	if(i!=size/2+1)
	            	System.out.print("*");
	            	else
	            	{
	            		System.out.print((char)asci);
	            		
	            		asci=asci+1;
	            	}
	            
	            }
	            System.out.println();
	           
	            
	            if (i < size/2+1) {
	                str += 2; 
	                spc -= 1; 
	    
	            } 
	            else {
	                str -= 2; 
	                spc += 1;
	                
	            }
	        }		

	}

}


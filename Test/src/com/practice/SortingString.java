package com.practice;

import java.util.Arrays;

public class SortingString
{
	 public static void main(String[] args) {
		 
		  String original = "sathish";
		  
		     char[] chars = original.toCharArray();
		     for (int i = 0; i <chars.length; i++)
		     {
		         for (int j = 0; j < chars.length; j++) 
		         {
			            if(chars[j]>chars[i]){
			            char temp=chars[i];
			            chars[i]=chars[j];
			              chars[j]=temp;
		          }
		     }
		  }
		 
		   
		    System.out.print(Arrays.toString(chars));
		    	
		 
		 }
}

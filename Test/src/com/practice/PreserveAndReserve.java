package com.practice;

public class PreserveAndReserve {

	public static void main(String[] args)
	{
		System.out.println("WE#LCOM# T@0 T@E#ST@ YANT@RA");
		System.out.println("After reversing and preserving");
		 System.out.println(reverseString(" WE#LCOM# T@0 T@E#ST@ YANT@RA"));  
	   }   
	   public static String reverseString(String input) {  
	     char[] inputArr = input.toCharArray();  
	     char[] tempArr = new char[input.length()];  
	     int i=0;  
	     int j=0;  
	     for (char ch: inputArr)
	     {  
	       if(Character.isAlphabetic(ch)){  
	         tempArr[i] = ch;  
	         i++;  
	       }  
	     }  
	     i--;  
	     while(j<i){  
	       char temp = tempArr[i];  
	       tempArr[i]= tempArr[j];  
	       tempArr[j]=temp;  
	       j++;  
	       i--;  
	     }  
	     for(i=0,j=0;i<input.length();i++){  
	       if(Character.isAlphabetic(inputArr[i])){  
	         inputArr[i]= tempArr[j++];  
	       }  
	     }  
	     return new String(inputArr);  
	}

}

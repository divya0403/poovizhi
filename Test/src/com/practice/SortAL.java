package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortAL {

	public static void main(String[] args) 
	{
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 al.add(52);
		 al.add(7);
		 al.add(85);
		 al.add(01);
		 al.add(127);
		 
		 System.out.println("Before sorting");
		System.out.print(al);
		
		Collections.sort(al);
		
		System.out.println();
		System.out.println();
		
		 System.out.println("After sorting");
		System.out.print(al);
				
	}

}

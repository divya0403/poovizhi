package com.practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class DelHashSet {

	public static void main(String[] args) 
	{
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the word");
		String str=ip.nextLine();
		HashSet<String> hs =new HashSet<String>();
		hs.add("Chennai");
		hs.add("Bangalore");
		hs.add("pune");
		hs.add("Delhi");
		hs.add("Kolkata");
		
		System.out.println(hs);
		
		Collection<String> removeCandidates = new LinkedList<String>();
		for(String s : hs)
		{
			if(s.equalsIgnoreCase(str))
			
				removeCandidates.add(s);
				hs.removeAll(removeCandidates);
			
			
		}
		System.out.println(hs);
	
	}

}

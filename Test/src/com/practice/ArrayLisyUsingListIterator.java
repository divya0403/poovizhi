package com.practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLisyUsingListIterator {

	public static void main(String[] args)
	{
		  ArrayList<Integer> li = new ArrayList<Integer>();        
	        li.add(23);
	        li.add(98);
	        li.add(29);
	        li.add(71);
	        li.add(5);	        
	        ListIterator<Integer> litr = li.listIterator();        
	        System.out.println("Elements in forward directiton");
	        System.out.println(li);
	        while(litr.hasNext()){
	            System.out.println(litr.next());
	        }	        
	        System.out.println("Elements in backward directiton");
	        System.out.println(li);
	        while(litr.hasPrevious()){
	            System.out.println(litr.previous());
	

	}
	}
	}

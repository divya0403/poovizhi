package com.practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Dummy {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Collection<Integer> removeCandidates = new LinkedList<Integer>();

		for(int i = 0; i < 10; i++)
		    set.add(i);

		for(Integer element : set)
		    if(element % 2 == 0)
		        removeCandidates.add(element);

		set.removeAll(removeCandidates);
		System.out.println(set);
	}

}

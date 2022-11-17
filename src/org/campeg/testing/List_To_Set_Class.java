package org.campeg.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_To_Set_Class {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(15);
		a.add(70);
		a.add(9);
		
		System.out.println("List :");
		System.out.println(a);
		
		Set<Integer> s = new HashSet<Integer>(a);
		System.out.println("Set:");
		System.out.println(s);
		
		
	}

}

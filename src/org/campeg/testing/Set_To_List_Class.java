package org.campeg.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_To_List_Class {
	
	public static void main(String[] args) {
		
		Set<String> a = new HashSet<String>();
	a.add("Ria");
	a.add("Bala");
	a.add("Preeti");
	System.out.println("Set:");
	System.out.println(a);
	
	List<String> s = new ArrayList<String>(a);
	System.out.println("List:");
	System.out.println(s);
	}

}

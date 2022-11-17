package org.campeg.testing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_Set {
	
public static void main(String[] args) {
		
		String array[]= {"Dog","Cat","Fish"};
		System.out.println(array);
		for (String string : array) {
			System.out.println(string);
		}
		Set<String> sets = new HashSet<>(Arrays.asList(array));
			System.out.println(sets);
		}
	

}

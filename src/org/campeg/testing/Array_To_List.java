package org.campeg.testing;

import java.util.Arrays;
import java.util.List;

public class Array_To_List {
	
	public static void main(String[] args) {
		
		Integer[] array= {2,17,9,5};
		System.out.println("Array Output:");
		for (int a : array) {
			System.out.println(a);
		}
		List<Integer> q = Arrays.asList(array);
		System.out.println("Convert Array---->List");
			System.out.println(q);
		}
	}



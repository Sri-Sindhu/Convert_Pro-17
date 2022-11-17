package org.campeg.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_To_List {
	
	public static void main(String[] args) {
		
		String a = "23,87,09";
		String str[]=a.split(",");
		System.out.println(a);
		
		List<String> list = new ArrayList<String>();
		list=Arrays.asList(str);
		for (String string : list) {
			System.out.println(string);
		}

}
}
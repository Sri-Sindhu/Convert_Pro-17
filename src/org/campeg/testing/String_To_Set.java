package org.campeg.testing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class String_To_Set {
	
public static void main(String[] args) {
		
		String a = "Leaders,Gandhi,Nehru";
		String str[]=a.split(",");
		System.out.println(a);
		List<String> list = Arrays.asList(str);
		
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		
		
}

}

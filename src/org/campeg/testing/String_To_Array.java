package org.campeg.testing;

public class String_To_Array {
	
	public static void main(String[] args) {
		
		String a = "Rainbow";
		System.out.println(a);
		
		System.out.println("Convert String to Array:");
		
		char[]s=a.toCharArray();
		for (char c : s) {
			System.out.println(c);
		}
	}

}

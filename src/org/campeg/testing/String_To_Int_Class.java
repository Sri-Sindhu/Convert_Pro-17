package org.campeg.testing;

public class String_To_Int_Class {
	
	public static void main(String[] args) {
		
		 // String -------> int
		
		String a = "123";
		int i = Integer.parseInt(a);
		System.out.println(i);
		System.out.println(i+456);    //it will add(int)
		System.out.println(a+456);    //it will (+)concat(string)
		
		String z= "as";         //or "12   "
		int s = Integer.parseInt(z);
		System.out.println(s);
		System.out.println(z);
	}

}


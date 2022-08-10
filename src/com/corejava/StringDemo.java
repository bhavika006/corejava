package com.corejava;

public class StringDemo {

	public static void main(String[] args) {
		String create = "Hello";
		System.out.println(create);
		
		// This is string for length
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The Length of the text String is:"+txt.length());
		  
		// This is string for Lowercase and Upercase
		String xyz = "My Name is Bhavika";
		System.out.println(xyz.toLowerCase());
		System.out.println(xyz.toUpperCase());
		
		// This is string for Finding a character in string
		String bha = "Please locate where 'locate' occurs!";
		System.out.println(bha.indexOf("locate"));
	}

}

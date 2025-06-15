package javabasics;

import java.util.Arrays;

public class Stringoperations {

	public Stringoperations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("welcome");
		//System.out.println(s);
		
		//length()-returns number of character of a string
		//int l=s.length();
		System.out.println(s1.length());
		String s2="  hello";
		//concat
		System.out.println(s2.concat(s1));  //s2+s1
		System.out.println("welcome"+"hello");
		
		//trim --remove spaces from left and right
		System.out.println(s2.trim());
		
		//charAt()  --returns character from string based on index
		System.out.println(s1.charAt(0));
		
		//contains()
		
		System.out.println(s1.contains("wel"));//true
		System.out.println(s1.contains("WEL"));//false as it is upper case
		//equals
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome")); 
		
		// replace method with single /multiple sequence of characters of a string
		String s="harika is at home";
		System.out.println(s.replace("harika", "Shreenika"));
		
		//substring
		
		System.out.println(s1.substring(1,3));
		
		//to uppercase
		System.out.println(s1.toUpperCase());
		
		//to lowercase
		System.out.println(s1.toLowerCase());
		
		//split the string 	into multiple parts based on the delimeter
		s="harika@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//exp 1
		s="harika,1122@gmail.com";
		String a1[]=s.split(",");
		System.out.println(Arrays.toString(a1));
		
		String a2[]=a1[1].split("@");
		System.out.println(Arrays.toString(a2));
		
		System.out.println(a[0]);
		System.out.println(a2[0]);
		System.out.println(a2[1]);
	}

}

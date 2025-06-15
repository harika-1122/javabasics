package javabasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Stringprograms {

	public void reversestringm1()
	{
		
		String s="Harika";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
			
		}
		System.out.println("Reverse string is:" +rev);
		
		
		
	}
	
	//method 2
	
	public void reversestringm2()
	{
		String s="Shreenika";
		String rev1="";
		char[] c=s.toCharArray();// converting the string into character type of Array
	
	for (int i=s.length()-1;i>=0;i--)
	{
		System.out.println(c[i]);
		rev1=rev1+c[i];
	}
	System.out.println("Reverse string is:" +rev1);
	
	}
	
	//method 3 -----using string bufferclass
	public void reversestringm3() {
	StringBuffer sbf=new StringBuffer("Prashvitha");
	
	System.out.println(sbf.reverse());
	
	}

	
	//mutable string method using string builder/buffer
	 
	public void mutablestring() {
		
		StringBuilder sbd= new StringBuilder("Praveen");
		
		System.out.println(sbd.append("Harika"));
	}
	//compare two string
	
	public void comparetwostrings()
	{
		//case1
		
	/*	String s1= "Harika";
		String s2= "Harika";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));*/
		
	//case2
		
		String s1= new String("Harika");
		String s2= new String("Harita");
	//when object is created the == compares the object and equals()compare the values of the object
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.compareTo(s2));
	}
	
	//given string is palindrom oe not
	
	//compare two strings
	
	//remove junk and special characters of a given string
	
	//count occurences of given characters of string
	
	//remove white spaces of string
	
	public  void Removesp()
	
	{
		String s="H@r !k@ is g**d gi  rl";
		
		String res="";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>=67 && s.charAt(i)<=122)
				
			{
			res=res+s.charAt(i);
			}	
					
			}
		System.out.println("after removing special characters and space: " +res);
		
		}
		
	public void removespace()
	{
		String s="h   a   rika";
	String res ="";
	
	
		res= res+s.replaceAll("\\s", "");
	
	
	System.out.println("after removing white spaces:" +res);
	}
	
public void countcharoccur() {
	
	String s = "Haarrikkaaaaa";
    char[] ch = s.toCharArray();
    boolean[] b = new boolean[s.length()];

    System.out.println("Character Occurrences:");
    for (int i = 0; i < ch.length; i++) {
        if (b[i]) continue;     // Skip already counted characters
        int c = 1;
        for (int j = i + 1; j < ch.length; j++) {
            if (ch[i] == ch[j]) {
                c++;
                b[j] = true;     // Mark character as counted
            }
        }
        System.out.println(ch[i] + ":" + c);
    }
}

//find the count duplicate characters

public void countduplicate() {
String s = "asdfasdfafk asd234asda";
Map<Character, Integer> charMap = new HashMap<Character, Integer>();
char[] arr = s.toCharArray();

for (char value: arr) {

   if (Character.isAlphabetic(value)) {
       if (charMap.containsKey(value)) {
           charMap.put(value, charMap.get(value) + 1);

       } else {
           charMap.put(value, 1);
       }
   }
}

System.out.println(charMap);

}
	
public void countduplicatewords() {
String s = "Harika is luck the best best of luck";
Map<String, Integer> charMap = new HashMap<String, Integer>();
String item[] = s.split(" ");

for (String t: item) {

   {
       if (charMap.containsKey(t)) {
           charMap.put(t, charMap.get(t) + 1);

       } else {
           charMap.put(t, 1);
       }
   }
}

System.out.println(charMap);
/*Set<String> keys = charMap.keySet();
for (String key : keys) {
    System.out.println(key+ ":" +charMap.get(key));
}*/
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringprograms str=new Stringprograms();
		str.reversestringm1();
		str.reversestringm2();
		str.reversestringm3();
		str.mutablestring();
		str.comparetwostrings();
		str.Removesp();	
		str.removespace();
		str.countcharoccur();
		str.countduplicate();
		str.countduplicatewords();
	}

}

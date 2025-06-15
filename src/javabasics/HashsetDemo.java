package javabasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet myset =new HashSet();
		
		//we can stor child class object in parent class variable
		//Set myset=new HashSet();
		
		myset.add("Harika");
		myset.add("Harika");
		myset.add(null);
		myset.add(null);
		myset.add(89);
		myset.add(123);
		System.out.println("check duplicates and multiple nulls:"+myset);
		
		//size of hashset
		System.out.println(myset.size());
		
		
		//remove element from hashset
		myset.remove(89);
		System.out.println("after removing;"+myset);
		
		//inserting element== insertion is not possible
		
		//access specific element==not possible
		
		//convert hashset to arraylist to access
		
		ArrayList al= new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//read all the elements using for each loop
		/*for(Object x:myset)
			System.out.println(x);
		*/
		
		//using Iterator
		
		Iterator <Object> it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		myset.clear();
		System.out.println(myset.isEmpty());
		}	
		
		
	}



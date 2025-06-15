package javabasics;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declaration
	ArrayList mylist =new ArrayList();
	//child class object can hold in parent class variable
	//List mylist=new ArrayList();

		//to store heteroginious dat 
		//ArrayList <Integer>mylist =new ArrayList<Integer>();
		//ArrayList <String>mylist =new ArrayList<String>();
		//to store homogenious data
		//ArrayList <Employee>mylist =new ArrayList<Employee>();
		
	//adding data into arraylist	
	mylist.add(99);
	mylist.add("Harika");
	mylist.add(14.7);
	mylist.add("B");
	mylist.add(null);
	mylist.add(null);
	mylist.add(10);

	//size of arraylist
	System.out.println("Size of the arraylist:" +mylist.size());
	//printing the l=arraylist
	System.out.println("Printing of data:"+mylist);
	//removing the array list
	mylist.remove(4);
	System.out.println("after remove modification Printing of data:"+mylist);
//inserting the element in arraylist
	mylist.add(1,"shree");
	System.out.println("after insertion:"+mylist);
	//modify element in the arraylist(modify/replace/change)
	mylist.set(3,"A");
	System.out.println("after modifying:"+mylist);
	//accessing specific element
	
	System.out.println(mylist.get(1));
	
	//reading all the elements from arraylist
	
	
	/*for(int i=0;i<mylist.size();i++)
	{
		System.out.println(mylist.get(i));
	}*/
	
	//for-each loop
	/*for(Object x :mylist)
		System.out.println(x);*/
	
	//using iterator
	Iterator <Object> it= mylist.iterator();//iterator method return iterator type of varaible 
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("is arraylist Empty:"+mylist.isEmpty());
	
	//remove all multiple specific elements randomly
	ArrayList mylist2= new ArrayList();
	mylist2.add(10);
	mylist2.add("Harika");
	mylist.removeAll(mylist2);
	System.out.println("after removing all multiple elements:" +mylist);
	
	//clear all the elements
	mylist.clear();
	System.out.println("Is arraylist empty:" +mylist.isEmpty());
	}}      


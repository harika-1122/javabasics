package javabasics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap mymap=new HashMap();
		//Map mymap=new HashMap();
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		//adding Pairs
		hm.put(101,"har");
		hm.put(102,"ika");
		hm.put(103,"shree");
		hm.put(103,"prashvi");
		
		//remove
		hm.remove(103);
		//access value
		hm.get(102);
		//get all the keys from hashmap
		hm.keySet();
		hm.values();
		hm.entrySet();
		
		//reading data from Hashmap
		
		//using foreach loop
		/*for(int k: hm.keyset()) {
			System.out.println(k+"   "+hm.get(k));
		}*/
		
		//Using Iterator
		Iterator<Entry<Integer,String>> it= hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
	}

}

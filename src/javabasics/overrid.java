package javabasics;

public class overrid {

	
	void walking(String name,int speed,String Style)
	{
		System.out.println(name + " is walking with "+speed +"kmph and with style "+Style);
	}
	void walking(String name,int speed)
	{
		System.out.println(name + " is walking with "+speed +"kmph");
	}
	void walking(String name,int lspeed,int hspeed,String Style)
	{
		System.out.println(name+ " is walking with "+lspeed + "," +hspeed+  "kmph and with style "+Style);
	}
}

  class OverridDemo
 {	
	 public static void main(String[] args) {
		
		 overrid o1 =new overrid();
		o1.walking("harika",20,"jog");
		overrid o2 =new overrid();
		o2.walking("harika",40);
		overrid o3 =new overrid();
		o3.walking("harika",20,40,"fast");
	}

 }

package javabasics;
//final,abstract,private restrict inheritence
public class inheritence extends superDemo{
	
	int x=10,y=3;
	
	void meth1(){
		
		System.out.println(--x);
	}
	inheritence(String name,int speed)
	{
		//super("harika",60);
		super();
		System.out.println("praveen from super cons " +name+ "and " +speed);
	}
	
	/*public class inheritence2 extends inheritence {
		
		int x=2,y=5;
		void meth2() 
		{
			
		System.out.print(++y);
	}
	}*/
	
	
	public static void main (String args[]) {
		inheritence i=new inheritence("praveen",30);
		i.meth1();
		//inheritence2 i1=i.new inheritence2();
		//i1.meth2();
	}
}

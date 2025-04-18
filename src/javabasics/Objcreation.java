

package javabasics;

public class Objcreation {
	
	public int add(int a,int b) //inst a and int b are formal parameters  
	{
		int c;        //actual parameters
		c=a+b;
		System.out.println(c);
		return(c);
	}
	public static void job()
	{
		System.out.println("this job is done");
		//Objcreation ob1=new Objcreation();
		
	}
	public int sub(int x) //inst a and int b are formal parameters  
	{
		        //actual parameters
		System.out.println(x);
		return x;
		
	}
	
public static void main(String[] args) {
	System.out.println("obj to be created");
							//Arguments are the values passed to the parameters
	Objcreation ob= new Objcreation();
	//new Objcreation();  -----nameless object
	//Objcreation ob; -------- named obj
	//ob=new Objcreation();
	ob.add(10,60);
	Objcreation.job(); 			//static methods and dm accessed by class reference
	ob.sub(10);
}
}

	
	

	

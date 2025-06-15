package javabasics;

public class exceptionhandling {
void f1(String s1,String s2) throws NumberFormatException
{
	int a=Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
int c=a+b;
System.out.println("c="+c);

}
void f2()
{
	System.out.println("hello");
}



public static void main(String s[] )
{
	try {
		exceptionhandling eh=new exceptionhandling();
		eh.f1(s[3], s[6]);
	}
	catch(NumberFormatException nfe)
	{
		System.err.println("please enter integers");
	}
	catch(NullPointerException ne)
	{
		System.err.println("create obj for class exc");
	}
	catch(Exception e) {
		System.err.println(e);
	}

}
}
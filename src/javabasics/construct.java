package javabasics;

//import java.util.Scanner;

public class construct {
int x;

construct(int x){
	
	this.x =x;
	System.out.println("local variable = " +x);
	
}

}
class constructdemo{
	public static void main(String args[]) {
	
		construct ot=new construct(100);	
		System.out.println("global variable=" +ot.x);
		
	}
}


//this() -used to call one constructor to another within the class
//			-it should be first stmt
// scope of this keyword is with in the class

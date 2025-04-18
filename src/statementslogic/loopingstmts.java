package statementslogic;
//looping statements are classifies into 3
//while loop
//do while loop
//for loop
public class loopingstmts {
	
	public static void main(String args[])  //reverse number()//
	{
		int n=458999; int rev=0,r;
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		System.out.printf("%d",rev);
	}

}

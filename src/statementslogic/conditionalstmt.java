package statementslogic;
//conditional stmts contains
//simple if
//if-else
//else if
//nested if
//switch
	
public class conditionalstmt {
	
	//simple if programs
	
	
//public static void main(String args[])
{
	int a=20,b=50,c=40;
	if(a>b && a>c)
	{
		System.out.println("a is largest");
	}
}
	public  void EvenorODD()
	{
		int a=20;
		if(a/2==0)
		{
			System.out.println("a is even");
		}
		else
			{
				System.out.println("a is odd");
			}
	}

public void switchcase() {
	char ch='w';
	switch (ch)
	{
	case 'm': System.out.println("manager");
	break;
	case 'D': System.out.println("developer");
	break;
	case 'w': System.out.println("web designer");
	break;
	default :System.out.println("invalid case");
	break;
	}
	System.out.println("end");
	
	}
		
	
}

}

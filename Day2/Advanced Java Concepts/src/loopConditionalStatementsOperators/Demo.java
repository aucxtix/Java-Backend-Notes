package loopConditionalStatementsOperators;

public class Demo 
{
	public static void main(String[] args) {
		// for loop ,while loop,do while loop, for each loop

		for (int i = 0; i < 5; i++) {
			if(i==1)
				continue;
			System.out.println("*");

		}

		int i =0;
		while(i<5)
		{
			System.out.print("*");
			i++;

		}

		do {
			System.out.println("*");
			i++;
		}while(i<5);

		
		int[] arr= {1,2,3};
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		
		// conditional statemenr
		
		if(i<5)
		{
			
		}
		else if(i>18)
		{
			
		}
		else {
			
			
		}
		
		// 
		int day=1;
		switch(day)
		{
		case 0: System.out.println("sunday");
		break;
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("tuesday");
		}
		
		
		int age = 18;
		
		
		String res=(age >= 18) ? "adult":"minor";
		
		System.out.println(res);
		
		
		// operators
		// math + - * / =
		// logic || && !
		// unary & | - ^
		// ternary ? :
		// relational >, <, = > ,= < , ==, 
		// assignment =
		// instanceof   
		
		
		
		


	}



}

package methods;

public class MethodDemo 
{
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(m1());
		System.out.println("main end");
	}
	
	public static int m1()
	{
		System.out.println("m1  start"); 
		System.out.println("m1 end");
	    return 10;
	}

}

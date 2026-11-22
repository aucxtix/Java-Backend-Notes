package ClassFundamentals;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		System.out.println(Demo1.x);
		Demo1.m1(10);
		
	    Demo1 demo=new  Demo1(); // object creation/instantiation
	    Demo1 demo2=demo;
	    
	    demo.m2();
	    System.out.println(demo.y);
		
		System.out.println();
		System.out.println("main end");
		
	}

}

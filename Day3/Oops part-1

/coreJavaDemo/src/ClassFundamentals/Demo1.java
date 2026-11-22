package ClassFundamentals;

public class Demo1 
{
	
	static int x = 10; // class variable common to all object
	       int y=1;  // instance/object instantiation variable
	       
	       Demo1() //default constr default const will always be no arg constructor
	       {
	    	   System.out.println("constructor");
	       }
	       
	static void m1(int x) // static method
	{
		int a=10; // local vars
		System.out.println("static method");
	}
	
	 void m2()  // non static method
	{
		 int a=10;	// local var  
		System.out.println("non static method");	
	}
	 
	
    static // static block
    {
		System.out.println("static block"); // auto invoked after class loading before calling main
	}
    
    // non static
	{
		System.out.println("non static"); // // auto invoked after instantiation but before constr 
	}
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

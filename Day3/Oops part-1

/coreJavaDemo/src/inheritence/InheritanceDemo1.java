package inheritence;

class A  // extends Object parent
{
	@Override
	public String toString() {
		return "A [y=" + y + "]";
	}
	static int x=10;
	
	

	int y =20;

	void m1()
	{
		System.out.println("non static method");
	}
	static void m2()
	{
		System.out.println(" static method");
	}
	

}

class B extends A  // child sub
{

}

class C extends Object
{
	//X(){}
	//+ 9 methods of objecct
	
}

public class InheritanceDemo1 
{

	public static void main(String[] args)
	{
		System.out.println(B.x);
	     System.out.println(new B().y);
	     
	     
	     System.out.println(new A().toString());
	     System.out.println(new A().hashCode());
	     System.out.println(new A().equals(new A()));
	     System.out.println(new A().toString());
	    
	}
}

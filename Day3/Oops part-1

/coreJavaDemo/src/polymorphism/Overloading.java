package polymorphism;

public class Overloading {

	
	static public void m1()
	{
		System.out.println("hello");
	}
	static public void m1(int x)
	{
		System.out.println("hello int ");
	}
	static public void m1(long x)
	{
		System.out.println("hello long");
	}
	public static void main(String[] args) {
		m1(10l);
	}
}

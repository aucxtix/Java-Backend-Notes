package polymorphism;
class G
{
	
}
class H extends G
{
	
}
class Parent
{
	 public Object m1(int x) {
		System.out.println("Parent logic");
		return null;

	}
}
class Child extends Parent
{
	  @Override
      public String m1(int y) { // this is called as method hiding its not overriding it looks like overriding
		System.out.println("Child own logic overrides parents");
		return null;
	}
}
public class Demo1 {
	public static void main(String[] args) {
		
	}
}

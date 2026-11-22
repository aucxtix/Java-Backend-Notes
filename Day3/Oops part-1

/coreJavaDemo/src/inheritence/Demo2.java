package inheritence;

class X
{
	int x = 10;
	int d =50;
	
	
	X()
	{
		
		super();
		System.out.println("X");
	}
}
class Y extends X
{
	int x = 20 ;
	
   Y(int x)
   {
	   super();
	   System.out.println("Y "+this.x);
	   System.out.println(super.x);
   }
 
	
}
class Z extends Y
{
	int x = 30;
	int d = 100;
	Z()
	{
		super(10);
		System.out.println("Z" +this.x);
		System.out.println("Z" +super.x);
		System.out.println("Z" + super.d);
	}
}
public class Demo2 
{
	public static void main(String[] args) 
	{
		new Z();
		
	}

}

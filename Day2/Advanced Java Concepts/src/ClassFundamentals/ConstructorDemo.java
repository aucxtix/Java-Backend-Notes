package ClassFundamentals;


class Customer
{
	int custId;
	String custName;
	String custEmail;
	

	Customer(int custId,String custName ,String custEmail)
	{
		this(custId,custName); // to call constructors of the same class
		this.custId=custId;  // shadowing problem
		this.custName=custName;
		this.custEmail=custEmail;
		System.out.println(" custID "+custId +" custName "+ custName +" custEmail "+ custEmail);
	}
	
	Customer(int custId,String custName)
	{
		this();
		System.out.println(" custID "+custId +" custName "+ custName);
		
	}
	Customer()
	{
		
		System.out.println("no args");
	}
	
}
public class ConstructorDemo {
	public static void main(String[] args) {
	Customer c1=	new Customer(1,"saqib","saqib@gmail.com");
	System.out.println(c1.custId);
	System.out.println(c1.custName);
	System.out.println(c1.custEmail);
	}
}

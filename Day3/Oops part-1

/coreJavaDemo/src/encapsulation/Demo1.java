package encapsulation;

class Employee // Java Bean Class , POJO class
{
	private int empId;
	private String empName;
	private String email;

	public Employee(int empId, String empName, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		 this.empId=empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	


}

public class Demo1 {
	
	public static void m1()
	{
		System.out.println("");
	}
	public static void m1(int x)
	{
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Syed","syed@gmail.com");
		emp1.setEmpId(2);
		System.out.println(emp1.getEmpId());
		m1(10);

	}
}

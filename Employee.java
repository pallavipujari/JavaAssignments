package JavaAssignment;

public class Employee {

	public String firstName;
	public String lastName;
	
	public String dept;
	
	public static int employeeId;
	
	protected double salary;
	
	private String ssn;
	
	public int level=4;
	public int basicPay=15000;
	public int BOA=10000;
	public int bonus=3500;

	
	
    void setSSN(String mySSN) {
		this.ssn=mySSN;
	}
	
	String getSSN() {
		return "my ssn "+ ssn;
	}
	
	public void employeeDetails(String fname,String lname) {
		
		System.out.println("My name is :"+fname + lname);
		
		this.firstName=fname;
		this.lastName=lname;
		
	}
	
	int  getCountLeaves() {
		return 5;
	}
	
	
	public static void main(String [] args) {
		
	Employee e =new Employee();
	
	
	e.setSSN("abcde");
    System.out.println(e.getSSN());
	e.employeeDetails("pallavi","pujari");
	
	
	}
}

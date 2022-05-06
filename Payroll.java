package JavaAssignment;

public class Payroll {

	protected int hourlyPay;
	protected int workingHours;
	protected int currentSalary;
	public static double takeHome;
	

	
	public void monthlyTakeHome(double avgWorkingHours,int basicSalary, int boa,int bonus ,int leaves) {
		
		int pf=(basicSalary*12)/100;
		
		if (avgWorkingHours<=9 ) 
		{
			if(leaves>2)
			{
				double lossOfPay=  (leaves-2) *  (((basicSalary+boa)*5)/100);
				
				takeHome=(basicSalary+(bonus/2)+boa-lossOfPay-pf);
				System.out.println("My takehome salary is for working less than 9hrs and leaves >2"+takeHome);
				
			}
			else 
			{
				takeHome=(basicSalary+(bonus/2)+boa-pf);
				System.out.println("My takehome salary is for working less than 9hrs and leaves less than 2"+takeHome);
			}
			
			
		}
		
		else if(avgWorkingHours>9)
		{
			double extraBonus=bonus+((bonus*10)/100);
			takeHome=basicSalary+extraBonus+boa-pf;
			System.out.println("My takeHome foe=r working more than 10hours "+takeHome);
		}
			
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
	    Payroll p= new Payroll();
	    
		double entryTime[]= {09.34,09.56, 09.00, 08.55};
		double exitTime[]= {17.25, 18.06, 17.55, 16.00};
		
		TimeOffice to=new TimeOffice();	
		double averageHours=to.averageWorkingHours(entryTime, exitTime);
		
		
		
		Employee pallavi =new Employee();
		int currntLeaves =pallavi.getCountLeaves();
		
		p.monthlyTakeHome(averageHours, pallavi.basicPay,pallavi.BOA,pallavi.bonus,currntLeaves);
		
		
		
		
		
		
	}
	
	
	
}


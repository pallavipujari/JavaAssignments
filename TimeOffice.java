package JavaAssignment;

public class TimeOffice {
	

	protected static int noOfLeaves;
	double avg;
	
	public double averageWorkingHours(double entry[],double exit[]) {
		double count = 0 ;
		
		for(int i=0;i<entry.length;i++) {
			count+=exit[i]-entry[i];
		}
		
		avg=count/entry.length;
		System.out.println(avg);
		
		return avg;
	}


    void setLeaves(int leaves) {
	
    	this.noOfLeaves=leaves;
	}
	
	int getLeaves() {
		return (this.noOfLeaves+1);
	}
	
	
	
	public static void main(String[] args) {
		
		double entryTime[]= {09.34,09.56, 09.00, 08.55};
		double exitTime[]= {17.25, 18.06, 17.55, 16.00};
		
		TimeOffice to=new TimeOffice();	
		to.averageWorkingHours(entryTime, exitTime);
		
		
		
	}
}

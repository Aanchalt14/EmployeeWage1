public class EmployeeWage {
   public static final int IS_PART_TIME=1;
   public static final int IS_FULL_TIME =2;
   public static final int EMP_RATE_PER_HOUR=20;
   public static final int NUM_OF_WORKING_DAYS=20;
   public static final int MAX_HRS_IN_MONTH=10;
   public static void main (String args[]) {
   
	   
  
   System.out.println("Welcome to employee wage computation");
   int empHrs=0;
   int empWage=0;
   int totalEmpHrs=0;
   int totalWorkingDays=0;
   int totalEmpWage=0;
   int empCheck=0;
    
   
   //UC-1
   empCheck =(int) Math.floor(Math.random() *10)%2;
   if(empCheck == IS_FULL_TIME)
   {   System.out.println("Employee is Present");
      empHrs=8;
   }
   else {
      System.out.println("Employee is Absent");
      empHrs=0;   
   }
   empWage=empHrs*EMP_RATE_PER_HOUR;
   System.out.println("Employee wage :" +empWage);
 
    
   
   //UC-2
   empCheck =(int) Math.floor(Math.random() *10)%2;
   if(empCheck == IS_FULL_TIME)
   {   System.out.println("Employee is Present");
      empHrs=8;
   }
   else {
      System.out.println("Employee is Absent");
      empHrs=0;   
   }
   empWage=empHrs*EMP_RATE_PER_HOUR;
   System.out.println("Employee wage :" +empWage);
  
  
   
   //UC-3
      if(empCheck == IS_PART_TIME)
	      empHrs=4;

	  else if(empCheck == IS_FULL_TIME)
	      empHrs=8;   
	   
	  else
	      empHrs=0;
	   empWage=empHrs*EMP_RATE_PER_HOUR;
	   System.out.println("Employee wage :" +empWage);
   
	   
	   
	//UC-4
    empCheck =(int) Math.floor(Math.random()*10)%3;
    switch(empCheck) {
     case IS_PART_TIME :
         empHrs=4;
         break;
     case IS_FULL_TIME :
         empHrs=8;
     default:
        empHrs=0;
   } 
   empWage=empHrs*EMP_RATE_PER_HOUR;
   System.out.println("Employee wage :" +empWage);
   
   
   
   //UC-5
   for(int day=0; day<NUM_OF_WORKING_DAYS;day++) {
	    switch(empCheck) {
	      case IS_PART_TIME :
	           empHrs=4;
	           break;
	      case IS_FULL_TIME :
	           empHrs=8;
	      default:
	           empHrs=0;
	 }
     empWage=empHrs*EMP_RATE_PER_HOUR;
     totalEmpWage += empWage;
	 System.out.println("Employee wage :" +empWage);
   }
	   System.out.println("Total emp wage : " +totalEmpWage);
  
	   
   
   //UC-6
   while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
   totalWorkingDays++ ;
   empCheck =(int) Math.floor(Math.random()*10)%3;
    switch(empCheck) {
      case IS_PART_TIME :
           empHrs=4;
           break;
      case IS_FULL_TIME :
           empHrs=8;
      default:
           empHrs=0;
    }
    empWage=empHrs*EMP_RATE_PER_HOUR;
    totalEmpHrs += empWage ;
    System.out.println("Employee wage :" +empWage);
   }
   totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
   System.out.println("Total emp wage : " +totalEmpWage);
 }
   //UC-7 Refactor using class
   public static int computeEmpWage() {
	  //Variables
	   int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
	   //Computation
	   while(totalEmpHrs <=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS) {
		  totalWorkingDays++;
	   int empCheck =(int)Math.floor(Math.random()*10)%3;
	   switch (empCheck) {
	     case IS_PART_TIME :
	    	  empHrs=4;
	    	  break;
	     case IS_FULL_TIME :
	    	  empHrs=8;
	     default:
	    	  empHrs=0;
	   }
	   totalEmpHrs += empHrs;
	   System.out.println("Day#: " +totalWorkingDays + "Emp Hr : " +empHrs);
	  }
	  int totalEmpWage=totalEmpHrs * EMP_RATE_PER_HOUR;
	  System.out.println("Total Emp Wage :" +totalEmpWage);
	  return totalEmpWage;
	 }
}
   




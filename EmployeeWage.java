public final class EmployeeWageBuilder {

    public static void main(String[] args) {
        computeEmpWage("Dmart",20,2,10);
        computeEmpWage("Oracle",10,20,15);

    }
    public static void computeEmpWage(String company, int MAX_WORKING_HRS, int NO_OF_WORKING_DAYS, int RATE_PER_HR){
        final int Is_Full_Time = 1;
        final int Is_Part_Time = 2;
        Random random = new Random();
        final int empRatePerHr = 20;
        int empHrs = 0;
        int totalEmpHrs = 0;
        int workingDays = 0;
        while (workingDays < NO_OF_WORKING_DAYS && totalEmpHrs <= MAX_WORKING_HRS) {
            int empCheck = random.nextInt(3);
            workingDays++;
            switch (empCheck) {
                case Is_Full_Time:
                    empHrs = 8;
                    break;
                case Is_Part_Time:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day :"+workingDays+" Emp Hr: "+empHrs);
        }
        System.out.println("TotalEmpHrs : " + totalEmpHrs);
        int salary = totalEmpHrs * empRatePerHr;
        System.out.println("COMPANY :"+company +"Salary : " + salary);

    }
}

package day2;

public class EmployeeSalary {
	
	double Basicpay;
	double BOA;
	double Bonus;
	double PF;
	double monthlygross;
	double TotalSalary;
	double yearlygross;
	double yearlytax;
	double monthlytax;
	String Employee;
	double Tax=0.0f;
	
	 void employeepay() {
		

		 PF = 0.12 * Basicpay;
		 monthlygross=(Basicpay+BOA+Bonus)-PF;
		 System.out.println("Monthly Gross income of"+Employee+" is : "+monthlygross);
		 yearlygross= monthlygross*12;
		 System.out.println("Yearly Gross income of"+Employee+" is : "+yearlygross);

		   if (yearlygross<250000) {
	  		   Tax=0.0f;
	  	   }
		   else if (yearlygross>=250000 && yearlygross<500000) {
	  		   Tax=0.05f;
	  	   }
		   else if (yearlygross>=500000 && yearlygross<750000) {
	  		   Tax=0.10f;
	  	   }
		   else if (yearlygross>=750000 && yearlygross<1000000) {
	  		   Tax=0.15f;
	  	   }
		   else if (yearlygross>=1000000 && yearlygross<1250000) {
	  		   Tax=0.20f;
	  	   }
		   else if (yearlygross>=1250000 && yearlygross<1500000) {	
	  		   Tax=0.25f;
	  	   }
		   else if (yearlygross>=1500000) {
	  		   Tax=0.30f;
	  	   }
		   
		 yearlytax= yearlygross*Tax;
		 monthlytax = yearlytax/12;
		 TotalSalary = monthlygross-monthlytax;
	  	 System.out.println("Final Salary income is : "+TotalSalary);
	 }
     
       public static void main(String[] args) {
        	   
    	   EmployeeSalary emp1 = new EmployeeSalary();
    	   emp1.Employee = "Level 1 Employee";
    	   emp1.Basicpay=7000;
    	   emp1.BOA=5000;
    	   emp1.Bonus=2000;
    	   
    	   EmployeeSalary emp2 = new EmployeeSalary();
    	   emp2.Employee = "Level 2 Employee";
    	   emp2.Basicpay=10000;
    	   emp2.BOA=7000;
    	   emp2.Bonus=2500;
    	 
    	   EmployeeSalary emp3 = new EmployeeSalary();
    	   emp3.Employee = "Level 3 Employee";
    	   emp3.Basicpay=12000;
    	   emp3.BOA=9000;
    	   emp3.Bonus=3000;
    	   
    	   EmployeeSalary emp4 = new EmployeeSalary();
    	   emp4.Employee = "Level 4 Employee";
    	   emp4.Basicpay=15000;
    	   emp4.BOA=17000;
    	   emp4.Bonus=4000;
    	      		  
    	   emp1.employeepay();    	 
    	   emp2.employeepay();    	
    	   emp3.employeepay();    	
    	   emp4.employeepay();
    	  
    	   
	}
}
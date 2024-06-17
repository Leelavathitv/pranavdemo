package day2;
			
public class EmployeeTakeHomeSalary {
		double basic;
		double boa;
		double bonus;
		double monthlygross;
		double yearlygross;
		double yearlytax;
		double monthlytax;
		double salary;
		double pf;
		double taxrate;
		void employee1()
		{
		pf=basic*.12;
		monthlygross = (basic+boa+bonus)- pf;
		System.out.println("Monthlygross of the employee is : "+monthlygross);
		yearlygross =monthlygross*12;
		System.out.println("Yearlygross of the employee is : "+yearlygross);
		if(yearlygross<250000)
		{
			taxrate = 0;
		}
			else if(yearlygross>=250000 && yearlygross<=500000)
			{
				taxrate =0.05f;
			}
		yearlytax = yearlygross * taxrate;
		monthlytax=yearlytax/12;
		salary=monthlygross-monthlytax;
		System.out.println("Take home salary is : "+salary);
			}
	public static void main(String[] args) {
		EmployeeTakeHomeSalary emp1=new EmployeeTakeHomeSalary();
		emp1.basic=7000;
		emp1.boa=5000;
		emp1.bonus=2000;
		emp1.employee1();
		EmployeeTakeHomeSalary emp2=new EmployeeTakeHomeSalary();
		emp2.basic=10000;
		emp2.boa=7000;
		emp2.bonus=2500;
		emp2.employee1();
		EmployeeTakeHomeSalary emp3=new EmployeeTakeHomeSalary();
		emp3.basic=12000;
		emp3.boa=9000;
		emp3.bonus=3000;
		emp3.employee1();
		EmployeeTakeHomeSalary emp4=new EmployeeTakeHomeSalary();
		emp4.basic=15000;
		emp4.boa=10000;
		emp4.bonus=3500;
		emp4.employee1();
		
	}
	}


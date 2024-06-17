package day2;

public class Payroll {
	double basic;
	float boa;
	float bonus;
	//float monthlygross;
	//float yearlygross;
	//float yearlytax;
	//float monthlytax;
	//float salary;
	void employee1()
	{
	double pf=basic*.12;
	double monthlygross=((basic+boa+bonus)-pf);
	System.out.println("Employee1 monthly gross income is "+monthlygross);
	double yearlygross=monthlygross*12;
	System.out.println("Employee1 yearly gross income is "+yearlygross);
	double yearlytax=yearlygross*0;
	double monthlytax=yearlytax/12;
	System.out.println("Employee1 monthly tax is "+monthlytax);
	double salary=monthlygross-monthlytax;
	System.out.println("Employee1 monthly takehome salary is "+salary);
	}
	void employee2()
	{
	double pf=basic*.12;
	double monthlygross=((basic+boa+bonus)-pf);
	System.out.println("Employee2 monthly gross income is "+monthlygross);
	double yearlygross=monthlygross*12;
	System.out.println("Employee2 yearly gross income is "+yearlygross);
	double yearlytax=yearlygross*0;
	double monthlytax=yearlytax/12;
	System.out.println("Employee2 monthly tax is "+monthlytax);
	double salary=monthlygross-monthlytax;
	System.out.println("Employee2 monthly takehome salary is "+salary);
	}
	void employee3()
	{
	double pf=basic*.12;
	double monthlygross=((basic+boa+bonus)-pf);
	System.out.println("Employee3 monthly gross income is "+monthlygross);
	double yearlygross=monthlygross*12;
	System.out.println("Employee3 yearly gross income is "+yearlygross);
	double yearlytax=yearlygross*.05;
	double monthlytax=yearlytax/12;
	System.out.println("Employee3 monthly tax is "+monthlytax);
	double salary=monthlygross-monthlytax;
	System.out.println("Employee3 monthly takehome salary is "+salary);
	}
	void employee4()
	{
	double pf=basic*.12;
	double monthlygross=((basic+boa+bonus)-pf);
	System.out.println("Employee4 monthly gross income is "+monthlygross);
	double yearlygross=monthlygross*12;
	System.out.println("Employee4 yearly gross income is "+yearlygross);
	double yearlytax=yearlygross*.05;
	double monthlytax=yearlytax/12;
	System.out.println("Employee4 monthly tax is "+monthlytax);
	double salary=monthlygross-monthlytax;
	System.out.println("Employee4 monthly takehome salary is "+salary);
	}
public static void main(String[] args) {
	Payroll emp1=new Payroll();
	emp1.basic=7000;
	emp1.boa=5000;
	emp1.bonus=2000;
	emp1.employee1();
	Payroll emp2=new Payroll();
	emp2.basic=10000;
	emp2.boa=7000;
	emp2.bonus=2500;
	emp2.employee2();
	Payroll emp3=new Payroll();
	emp3.basic=12000;
	emp3.boa=9000;
	emp3.bonus=3000;
	emp3.employee3();
	Payroll emp4=new Payroll();
	emp4.basic=15000;
	emp4.boa=10000;
	emp4.bonus=3500;
	emp4.employee4();
	
}
}

package day2;

	import java.util.Scanner;

	public class EmployeeHomeSalary {

		static int EmpLevel;
		static double BasicPay;
		static int BOA;
		static double bonus;
		static double PF = 0.12;
		static double totalIncome;
		static double monthlyGross;
		static double yearlyGross;
		static double yearlyTax;
	 static double monthlyTax;
	 static double Pfund;
	 static double Taxrate;
	 static double newTaxrate;
	 static double yearlyTaxNew;
	 
		
		
		public double calculatePF(double BasicPay) {
			Pfund= BasicPay*PF;
			return Pfund;
		}
		public double  MonthlyGross(double BasicPay,double BOA,double bonus,double Pfund ) {
			 monthlyGross = (BasicPay+BOA+bonus)-Pfund;
			 return monthlyGross;
		}
		
		public double YearlyGross(double monthlyGross) {
			yearlyGross= monthlyGross *12;
			return yearlyGross;
		}
		
		public double CalculateBonus(int EmpLevel) {
			int bonus = 0;
		     
			if (EmpLevel==1) {
				bonus = 2000;
				
			} else if(EmpLevel==2){
				bonus= 2500;
			}else if(EmpLevel==3) {
				bonus= 3000;
			}else if(EmpLevel ==4) {
				bonus = 3500;
			}
			return bonus;	
		}
		
		public double TaxRate(double yearlyGross) {
			double Taxrate=0;
			
			if (yearlyGross<=250000) {
				Taxrate= 0;
			}else if(yearlyGross>=250001 && yearlyGross<=500000) {
				Taxrate=0.05;
			}else if(yearlyGross>=500001 && yearlyGross<=750000) {
				Taxrate=0.20;
			}else if(yearlyGross>=750001 && yearlyGross<=1000000) {
				Taxrate=0.15;
			
			}else if(yearlyGross>=1000001 && yearlyGross<=1250000) {
	  	      
	  	     Taxrate=0.30; 
	  	      
	  	    }else if(yearlyGross>=1250001 && yearlyGross<=1500000) {
	  	      
	  	     Taxrate=0.30;
	  	      
	        }else if(yearlyGross>1500000) {
	  	      
	  	      Taxrate=0.30;
	        }
			
			return Taxrate;
			
		}
		
		public double newTaxRate(double yearlyGross) {
			double newTaxrate=0;
			
			if (yearlyGross<=250000) {
				newTaxrate= 0;
			}else if(yearlyGross>=250001 && yearlyGross<=500000) {
				newTaxrate=0.05;
			}else if(yearlyGross>=500001 && yearlyGross<=750000) {
				newTaxrate=0.10;
			}else if(yearlyGross>=750001 && yearlyGross<=1000000) {
				newTaxrate=0.15;
			
			}else if(yearlyGross>=1000001 && yearlyGross<=1250000) {
	  	      
				newTaxrate=0.20; 
	  	      
	  	    }else if(yearlyGross>=1250001 && yearlyGross<=1500000) {
	  	      
	  	    	newTaxrate=0.25;
	  	      
	        }else if(yearlyGross>1500000) {
	  	      
	        	newTaxrate=0.30;
	        }
			
			return newTaxrate;
			
		}
		
		
		
		public double YearlyTax(double yearlyGross,double Taxrate) {
			double yearlyTax=yearlyGross * Taxrate;
			return yearlyTax;
		}
		
		public double YearlyTaxNew(double yearlyGross,double newTaxrate) {
			double yearlyTax=yearlyGross * newTaxrate;
			return yearlyTax;
		}
		
		
		public double MontlyTax(double yearlyTax) {
			
			double monthlyTax = yearlyTax/12;
			return monthlyTax;
		}
		public void FinalSal(double monthlyGross,double monthlyTax) {
			double finalsal= monthlyGross-monthlyTax;
			
			
			System.out.println("Employee final salary taking to home : " +finalsal);
		}
		
		public static void main(String[] args) {
			//System.out.println("Enter Details for Employee ");
			Scanner sc = new Scanner(System.in);
			EmployeeHomeSalary empsal = new EmployeeHomeSalary();
			System.out.println("Enter Level :");
		    EmpLevel = sc.nextInt();
		    System.out.println("Enter BasicPay :");
		    BasicPay = sc.nextInt();
		    
		    System.out.println("Enter BOA :");
		   BOA =sc.nextInt();
		   bonus = empsal.CalculateBonus(EmpLevel);
		   
		    System.out.println("Bonus for Level :"+bonus);
		    
		    //bonus = sc.nextInt();
		    Pfund=empsal.calculatePF(BasicPay);
		     
		    System.out.println("PF Calculation :" +Pfund);
		    //Pfund = sc.nextInt();
		    
		    monthlyGross =empsal.MonthlyGross(BasicPay,BOA,bonus,Pfund);
		    System.out.println("MontlyGrossIncome :"+monthlyGross);
		    
		    yearlyGross = empsal.YearlyGross(monthlyGross);
		    System.out.println("YearlyGrossIncome :"+yearlyGross);
		    
		 Taxrate=empsal.TaxRate(yearlyGross);
		 //System.out.println("Taxrate :"+Taxrate);
		 
		 newTaxrate=empsal.newTaxRate(yearlyGross);
		//System.out.println("neTaxrate :"+newTaxrate);
		    
		    yearlyTax = empsal.YearlyTax(yearlyGross,Taxrate);
		    System.out.println("YearlyTaxIncome for Exist Tax Rate :"+yearlyTax);
		    
		    yearlyTaxNew = empsal.YearlyTaxNew(yearlyGross,newTaxrate);
		    System.out.println("YearlyTaxIncome for New Tax Rate :"+yearlyTaxNew);
		    
		    monthlyTax=empsal.MontlyTax(yearlyTax);
		    System.out.println("MonthlyTaxIncome :"+monthlyTax);
		    
		    empsal.FinalSal(monthlyGross,monthlyTax);
		    
		    
		  
		    sc.close();
		}
		
		
	}

		
			// TODO Auto-generated method stub
			
		




package day3;

//import java.util.Scanner;

public class LeapYear 
{
	public static void main(String args[])
	{
		System.out.println("The leap years between 2000 and 2100 are :");
		for(int year= 2000;year<=2100 ;year++)
		{
			if ((year%100!=0 ) && (year%4==0)) {
				System.out.println(year);
			}
				else if(year%400==0)
				{
					System.out.println(year);
				}
				//else
					//System.out.println(year+ " not a leap year");
		}
	}
}
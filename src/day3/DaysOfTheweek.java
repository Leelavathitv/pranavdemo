package day3;

import java.util.Scanner;

public class DaysOfTheweek {
public static void main(String[] args) {
	Scanner num=new Scanner(System.in);
	System.out.println("Enter a number between 1 to 7 ");
	int day=num.nextInt();
	if (day>7) 
	{
		System.out.println("Please enter a number between 1 to 7");
	int rep=num.nextInt();
	day=rep;
	}
	num.close();

	switch (day) {
	case 1:
		System.out.println("Day of the Week is Sunday");
		break;
	case 2:
		System.out.println("Day of the Week is Monday");
		break;
	case 3:
		System.out.println("Day of the Week is Tuesday");
		break;
	case 4:
		System.out.println("Day of the Week is Wednesday");
		break;
	case 5:
		System.out.println("Day of the Week is Thursday");
		break;
	case 6:
		System.out.println("Day of the Week is Friday");
		break;
	case 7:
		System.out.println("Day of the Week is Saturday");
		break;
	//default:
		//break;
	}
}
}

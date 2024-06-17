package day1;

import java.util.Scanner;

public class Newmark {
public static void main(String[] args) {
	float total;
	float average;
	Scanner student = new Scanner(System.in);
	System.out.println("Enter your Name: ");
	String name = student.next();
	System.out.println("Enter Your English Mark:");
	float english = student.nextFloat();
	System.out.println("Enter Your Maths Mark:");
	float maths = student.nextFloat();
	System.out.println("Enter Your Science Mark:");
	float science = student.nextFloat();
	System.out.println("Enter Your Social Mark:");
	float social = student.nextFloat();
    total = english + maths + science + social;
    System.out.println(name + " Total is :"+ total);
    average = total/4;
    System.out.println(name + " Average is :"+ average);
    student.close();
    	}
}


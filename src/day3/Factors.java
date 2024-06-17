package day3;

import java.util.Scanner;

public class Factors {
public static void main(String[] args) {
	int count=0;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter a number to find factor:");
	int n=num.nextInt();
	System.out.print("Factors of "+n+" are ");
	for (int i=1;i<=n;i++)
	{
		if (n%i==0) {
			
			System.out.print(i+ " ");
			count++;
		}
	}
	//System.out.println("We have " +count +"factors which are :");
	System.out.println(" and the Factor count is :" +count);
	num.close();
	}
}

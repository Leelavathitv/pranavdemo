package day3;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
Scanner num = new Scanner(System.in);
System.out.println("Enter a number to find prime");
	int n=num.nextInt();
	int count=0;
	num.close();
	for(int i=2;i<n;i++)
	{
		if(n==1)
			System.out.println("not a prime number");
	if(n%i==0)
		{
		System.out.println(n +" is not a prime number");
		}
	else

	System.out.println(n +" is a prime number");
	}
}

}

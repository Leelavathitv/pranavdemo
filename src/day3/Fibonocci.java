package day3;
import java.util.Scanner;
public class Fibonocci {
static int Fibonacci(int count)
{
	if(count==0)
		{
		return 0;
		}
	if(count==1 ||count==2)
	{
		return 1;
	}
		//return Fibonacci(count-1)+Fibonacci(count-2);
	return 2;
}		
public static void main(String[] args) {
	Scanner num=new Scanner(System.in);
	System.out.println("Enter a number to get series:");
	int f=num.nextInt();
	num.close();
	System.out.println("Fibonacci series of "+f+" is :");
	for (int i=0;i<=f;i++)
	{
	System.out.print(Fibonacci(i)+" ");
	}

}
}


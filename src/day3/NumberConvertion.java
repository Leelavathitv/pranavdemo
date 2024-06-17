package day3;

import java.util.Scanner;

public class NumberConvertion {
public static void main(String[] args)
{
	
    //int Number = 14;
    //int i = convertInttoBin(Number);
    //System.out.println(i);
//	System.out.println("Number in Binary Form  " + Integer.toBinaryString(Number));
//	System.out.println("Number in Hexa Form " + Integer.toHexString(Number));
//	System.out.println("Number in Octal Form " + Integer.toOctalString(Number));
//	String a = "test";
//	System.out.println("Reversed Word : " + revstr(a));
	//}
Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to convert to binary:");
    int n = sc.nextInt();
    sc.close();
    NumberConvertion obj = new NumberConvertion();
    int m = obj.Number(n);
    System.out.println("The binary equivalent is:"+ m);
}
public int Number(int n)
{
    if (n == 1) 
    {
        return 1;
    }
    return Number(n / 2) * 10 + n % 2;
}
}

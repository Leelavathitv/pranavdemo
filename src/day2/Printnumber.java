package day2;

public class Printnumber {
	int a=10;
	int b=20;
	void printnumber1()
	{
		System.out.println("Value of A in method 1 is "+a);
		System.out.println("Value of B in method 1 is "+b);
	}
void printnumber2() {
	int a=100;
	int b=200;
	System.out.println("Value of A in method 2 is "+a);
	System.out.println("Value of A in method 2 is "+b);
}

public static void main(String[] args) {
	Printnumber obj=new Printnumber();
	obj.printnumber1();
	obj.printnumber2();
}
}

package day2;

public class Addition {
	int input1;
	int input2;
	void addnumber1(int a,int b)
{
	int sum = a + b;
	System.out.println("Sum of "+a+" and sum of "+b+ " in method is "+sum);
		
	}
int addnumber2(int a,int b)
{
	int sum = a + b;
	return sum;
}
int addnumber3()
{
	int sum = input1+input2;
	return sum;
	}
void addnumber4()
{
	int sum = input1+input2;
	System.out.println("Sum of "+input1+"and sum of "+input2+ "in method is "+sum);
	}

public static void main(String[] args) {
	Addition obj=new Addition();
	obj.addnumber1(10,20);
	int output2=obj.addnumber2(30,40);
	System.out.println("Sum of 30 and 40 is "+output2);
	obj.input1=output2;
	obj.input2=50;
	int output3=obj.addnumber3();
	System.out.println("Sum of "+output2 +" and 50 is" +output3);
	obj.input1=output2;
	obj.input2=output3;
	obj.addnumber4();
	
}
}

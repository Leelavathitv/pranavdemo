package day1;

public class Student {
float english;
float maths;
float science;
float social;
float total;
float average;
void sum()
{
	total=english+maths+science+social;
	System.out.println("Total Marks is : "+total);
			}
void avg() {
	average=total/4;
	System.out.println("Average is : "+average);
}
public static void main(String[] args) {
	Student obj=new Student();
	obj.english=80;
	obj.maths=100;
	obj.science=93;
	obj.social=85;
	obj.sum();
	obj.avg();
}
}


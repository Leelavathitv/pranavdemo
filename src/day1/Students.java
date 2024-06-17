package day1;

public class Students {
float english;
float maths;
float science;
float social;
float total;
float average;
void sum()
{
	total=english+maths+science+social;
	System.out.println(total);
}
void avg() 
{
	average=total/4;
	System.out.println(average);
}
public static void main(String[] args) {
	Students hema=new Students();
	hema.english=80;
	hema.maths=100;
	hema.science=93;
	hema.social=85;
	System.out.println("Hema Total Mark is: ");
	hema.sum();
	System.out.println("Hema Average is: ");
	hema.avg();
	Students hetal=new Students();
	hetal.english=50;
	hetal.maths=48;
	hetal.science=40;
	hetal.social=35;
	System.out.println("Hetal Total Mark is: ");
	hetal.sum();
	System.out.println("Hetal Average is: ");
	hetal.avg();
	Students priya=new Students();
	priya.english=66;
	priya.maths=65;
	priya.science=63;
	priya.social=56;
	System.out.println("Priya Total Mark is: ");
	priya.sum();
	System.out.println("Priya Average is: ");
	priya.avg();
	Students rashmi=new Students();
	rashmi.english=70;
	rashmi.maths=84;
	rashmi.science=79;
	rashmi.social=73;
	System.out.println("Rashmi Total Mark is: ");
	rashmi.sum();
	System.out.println("Rashmi Average is: ");
	rashmi.avg();
}
}


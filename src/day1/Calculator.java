package day1;

public class Calculator {
float input1;
float input2;
float output;
void addition () {
	output=input1+input2;
	System.out.println("Addition output is : "+output);
}
void subtraction() {
	output=input1-input2;
	System.out.println("Subtraction output is : "+output);
}
void multiplication () {
	output=input1*input2;
	System.out.println("multiplication output is : "+output);
}
void division () {
	output=input1/input2;
	System.out.println("Division output is : "+output);
}
public static void main(String[] args) {
	Calculator obj1 = new Calculator();
	obj1.input1 = 20.5f;
    obj1.input2 = 10;
			obj1.addition();
			obj1.subtraction();
			obj1.multiplication();
			obj1.division();
}
}

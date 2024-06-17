package day2;

	public class Operator	
	{
		
		 int a = 9; //class level variable
		 int b = 10; //class level variable
		 
		 //Global variable - class level variable - instance variable
		 //Local variable - method level variable
		
		 
		public void uneryOperator() {
			
			//++a => a=1+ a - pre-incrementation
			//a++ => a=a +1 - post-incrementation	
		
			++a; //pre incrementation
			System.out.println("after pre incrementation " + a); //a value becomes 10
			
			a++; //post incrementation (it's used with interator) 
			System.out.println("After post incrementation " + a); //a value becomes 11

			--a; //pre decrementation
			System.out.println("After pre decrementation " + a); //a value becomes 10
			
			a--; //post decrementation (it's used with interator)
			System.out.println("After post decrementation " + a); //a value becomes 9
			
		}
		
		public void binaryOperator() {
			
			//Arithmatic operators
			System.out.println("Addition : "+(a+b));
			System.out.println("Subtraction : "+(a-b));
			System.out.println("Multiplication : "+(a*b));
			System.out.println("Division : "+(a/b));
			System.out.println("Modulus : "+(a%b));

			//relational operator - will give boolean output
			
			System.out.println("A is greater than B : "+(a>b));
			System.out.println("A is greater than or equal to B : "+(a>=b));
			System.out.println("A is less than B : "+(a<b));
			System.out.println("A is less than or equal to B : "+(a<=b));
			System.out.println("A is exactly equal to  B : "+(a==b));
			System.out.println("A is not equal to  B : "+(a!=b));
					
			System.out.println("And logical operator :" + (a>b && a<=b) );
			System.out.println("OR logical operator :" + (!(a>b) || a<=b) );

			System.out.println("boolean And : " +((a>10)&(b>10)));
			System.out.println("boolean or : "+ ((a>10)|(b>10)));
			
			System.out.println("Adding 10 with A " + (a+=10)); //a=a+10
			
			System.out.println("bitwise And :" + (a&b));
			System.out.println("bitwise xor " + (a^b));
			
//			(a>10)&(b>10)& (a>b))-> (true & true) & false => false
			
//								-> (true) & false => false
//								
//			(a>10)&&(b>10)&& (a>b))->	true && true && false -> false

			
			
			// 19->  10011
			// 10->  01010
		//19&10 ->   00010
			//a&b =  x ->2
			
			//a=112 ->1110000
			//b=115 ->1110011
			//a & b ->1110000 - > 112

			
		}

		public void terneryOperator() {
		 //(condition ? statement1 : statement2)
			System.out.println((b>1 ? "B value is greater than 1" : "B value is less or equal to 1"));
		
		}
		
		
		public static void main(String[] args) {
			
			
			//className <anyName> = new className(inputs for constructor);
			Operator opsExample = new Operator();

			opsExample.uneryOperator();
			//opsExample.binaryOperator();
			//opsExample.terneryOperator();
		}
		
		
	}



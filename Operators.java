package day4;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNumber=sc.nextInt();
		System.out.println("ENter the second number: ");
		int secondNumber=sc.nextInt();
		System.out.println("\n");
		System.out.println("Arthmetic Operators: ");
		System.out.println("Addition: "+(firstNumber+secondNumber));
		System.out.println("Subtraction: "+(firstNumber-secondNumber));
		System.out.println("Multiplication: "+firstNumber*secondNumber);
		System.out.println("Division: "+firstNumber/secondNumber);
		System.out.println("Modules: "+firstNumber%secondNumber);
		System.out.println("\n");
		System.out.println("Relational Operators:");
		System.out.println(firstNumber+" > "+secondNumber+": "+(firstNumber>secondNumber));
		System.out.println(firstNumber+" < "+secondNumber+": "+(firstNumber<secondNumber));
		System.out.println(firstNumber+" >= "+secondNumber+": "+(firstNumber>=secondNumber));
		System.out.println(firstNumber+" <= "+secondNumber+": "+(firstNumber<=secondNumber));
		System.out.println(firstNumber+" == "+secondNumber+": "+(firstNumber==secondNumber));
		System.out.println(firstNumber+" != "+secondNumber+": "+(firstNumber!=secondNumber));
		System.out.println("\n");
		System.out.println("Logical Opeartors:");
		System.out.println(firstNumber+" > 10"+" AND "+secondNumber+" < 50): "+(firstNumber>10 && secondNumber<50));
		System.out.println(firstNumber+" < 5"+" OR "+secondNumber+" < 50): "+(firstNumber<5 && secondNumber>100));
		System.out.println("\n");
		System.out.println("Assignment Opeartors:");
		int initialValue=10;
		System.out.println("After += : "+(initialValue+=firstNumber));
		System.out.println("After -= : "+(initialValue-=firstNumber));
		System.out.println("After *= : "+(initialValue*=firstNumber));
		System.out.println("After /= : "+(initialValue/=firstNumber));
		System.out.println("After %= : "+(initialValue%=firstNumber));
		System.out.println("\n");
		System.out.println("Unary Opeartors:");
		System.out.println("Initial Value:"+firstNumber);
		System.out.println("After Increment: "+(++firstNumber));
		System.out.println("After Increment: "+(--firstNumber));
		System.out.println("\n");
		System.out.println("Conditional Oprators:");
		String result=(firstNumber%2==0)?"Even":"Odd";
		System.out.println(firstNumber+" is "+result);
		
		
		
	}

}

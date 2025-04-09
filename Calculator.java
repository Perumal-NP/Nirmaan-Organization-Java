package day6;

import java.util.Scanner;

public class Calculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first Number: ");
		int num1=sc.nextInt();
		System.out.println("ENtert second Number: ");
		int num2=sc.nextInt();
		System.out.println("Enter the Key : \n 1.Addition \n 2.subtraction \n 3.Multiplicatin \n 4.Divition ");
		int key=sc.nextInt();
		switch(key) {
		case 1:{
			System.out.println("Addition: "+(num1+num2));
			break;
		}
		case 2:{
			System.out.println("Subtraction: "+(num1+num2));
			break;
		}
		case 3:{
			System.out.println("Multiplication: "+(num1*num2));
			break;
			
		}
		case 4:{
			System.out.println("Divition: "+(num1/num2));
			break;
			
		}
		default:{
			System.out.println("Invaild Number");
			break;
		}
		}

	}

}

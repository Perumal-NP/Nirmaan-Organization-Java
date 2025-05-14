package day14;

import java.util.Scanner;

public class BankAccountDetailsManagement {
private int id;
private String name;
private int balance;
private int accNo;
int pin=123456;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance,int pin1) {
	if(pin==pin1) {
	this.balance = balance;
	System.out.println(this.balance +" Withrawl successfully");
	}else {
		System.err.println("Incorrect Pin");
	}
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}


public BankAccountDetailsManagement(int id, String name, int balance, int accNo) {
	super();
	this.id = id;
	this.name = name;
	this.balance=balance;
	this.accNo = accNo;
}
public BankAccountDetailsManagement() {
	super();
}

public String toString() {
	return "BankAccountDetailsManagement [id=" + id + ", name=" + name + ", balance=" + balance + ", accNo=" + accNo
			+ "]";
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BankAccountDetailsManagement b1=new BankAccountDetailsManagement();
	boolean isWork=true;
	while(isWork) {
	System.out.println("Enter 1 For Add Account");
	System.out.println("Enter 2 for Withrawl ");
	System.out.println("Enter 3 for show Account Details");
	System.out.println("Enter 0 exit ");
	int key=sc.nextInt();
	if(key==1) {
		System.out.println("Enter the Account id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Person Name: ");
		String name=sc.nextLine();
	
		System.out.println("Enter the Balance: ");
		int balance=sc.nextInt();
		System.out.println("Entert the Account Number: ");
		int accNo=sc.nextInt();
		b1= new BankAccountDetailsManagement(id,name,balance,accNo);
	}
	else if(key==2) {
		System.out.println("Update the Balance: ");
		int bal=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Pin: ");
		int pin=sc.nextInt();
		int total=b1.getBalance()-bal;
		b1.setBalance(total, pin);
		
	}
	else if(key==3) {
		System.out.println(b1);
	}
	else if(key==0) {
		isWork=false;
		System.out.println("Thankyou");
	}
}

}
}

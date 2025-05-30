package day14;

import java.util.Scanner;

class Details{
	private int Id;
	private String Name;
	private int Balance = 100000;
	private int Accountno;
	private int pin = 9363;
	
	public Details(int id, String name, int accountno) {
		super();
		Id = id;
		Name = name;
		Accountno = accountno;
	}
	
	public Details() {
		super();
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance,int pin) {
		if(this.pin == pin) {
			this.Balance = balance;
		}
	}
	public int getAccountno() {
		return Accountno;
	}
	public void setAccountno(int accountno) {
		this.Accountno = accountno;
	}
	@Override
	public String toString() {
		return "Details [Id=" + Id + ", Name=" + Name + ", Balance=" + Balance + ", Accountno=" + Accountno + "]";
	}
	
	
	
}
public class AccountManagement {

	public static void main(String[] args) {
		Details D = new Details();
		Scanner sc = new Scanner(System.in);
		boolean Checking = true;
		while(Checking) {
			System.out.println("Choise is yours : 1.Add 2.Update 3.View 4.Balance Access 5.Exit");
			System.out.println("Enter the your choise : ");
			int Check = sc.nextInt();
			switch(Check) {
			case 1:
				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name : ");
				String name = sc.nextLine();
				System.out.println("ENter Account Number : ");
				int acno = sc.nextInt();
				D = new Details(id,name,acno);
				break;
				
			case 2:
				System.out.println("ENter Id : ");
				int ID = sc.nextInt();
				D.setId(ID);
				sc.nextLine();
				System.out.println("ENter Name : ");
				String NAME = sc.nextLine();
				D.setName(NAME);
				System.out.println("ENter Accno : ");
				int ACC = sc.nextInt();
				D.setId(ACC);
				break;
				
			case 3:
				System.out.println(D);
				break;
			case 4:
				System.out.println("Enter Your Blance :");
				int amount = sc.nextInt();
				System.out.println("ENter Your pin :  ");
				int PIN = sc.nextInt();
				D.setBalance(amount, PIN);
				break;
			case 5:
				Checking = false;
				break;
			}
		}
		                                          
		                                          
		                                          
                                                  
	}                                             
                                                  
}

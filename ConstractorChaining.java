package day17;

class Person{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public void display() {
		System.out.println("heloo");
	}
	
}
class Details extends Person{
	int address;

	public Details(int age, String name,int address) {
		super(age, name);
		this.address = address;
		super.display();
	}
}
class v extends Details{
	int a;
	public v(int age, String name, int address , int a) {
		super(age, name, address);
		this.a = a;
		
	}
	
}
public class ConstractorChaining {

	public static void main(String[] args) {
	Details d = new Details(12,"Prasanna",12);
	System.out.println(d.age + d.name + d.address);
	}

}

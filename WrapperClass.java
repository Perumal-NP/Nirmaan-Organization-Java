package day21;

public class WrapperClass {

	public void unBox() {
		System.out.println("****** UnBoxing *******");
		Integer num=10;
		int num2=num;
		System.out.println(num2);
		Float digit=2.5f;
		float digit2=digit;
		System.out.println(digit2);
		Double d1=2.576858764745;
		double d=d1;
		System.out.println(d);
		Boolean isWork=false;
		boolean iswork2=isWork;
		System.out.println(iswork2);
		Byte age=18;
		byte age2=age;
		System.out.println(age2);
		Short s1=30000;
		short s2=s1;
		System.out.println(s2);
		
		
	}
	public void autoBox() {
		System.out.println("******AutoBoxing *******");
		int num2=10;
		Integer num=num2;
		System.out.println(num);
		float f=9.7676f;
		Float f1=f;
		System.out.println(f1);
		double d1=23.7678769986;
		Double d2=d1;
		System.out.println(d2);
		boolean job=true;
		Boolean job1=job;
		System.out.println(job1);
		byte b1=127;
		Byte b2=b1;
		System.out.println(b2);
		short s1=21342;
		Short s2=s1;
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
	WrapperClass c1=new WrapperClass();
	c1.autoBox();
	c1.unBox();

	}

}

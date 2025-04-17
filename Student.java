package day8;

public class Student {
int rollNo;
String name;
public static void main(String[] args) {
	Student st=new Student();
	st.rollNo=10;
	st.name="perumal";
	System.out.println(st.rollNo);
	System.out.println(st.name);
	System.out.println("*************");
	Student st1=new Student();
	st1.rollNo=11;
	st1.name="prasanna";
	System.out.println(st1.rollNo);
	System.out.println(st1.name);
	System.out.println("*************");
	Student st2=new Student();
	st2.rollNo=12;
	st2.name="harish";
	System.out.println(st2.rollNo);
	System.out.println(st2.name);
	System.out.println("*************");
	Student st3=new Student();
	st3.rollNo=13;
	st3.name="mohan";
	System.out.println(st3.rollNo);
	System.out.println(st3.name);
	System.out.println("*************");
}
}

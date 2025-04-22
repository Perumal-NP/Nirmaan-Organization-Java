package day10;

public class EmployeeDetails {
	String name;
	long phoneNo;
	double salary;
	 public void employee() {
		 
		System.out.println("Employee Name: "+name);
		System.out.println("Employee phoneNo: "+phoneNo);
		System.out.println("Employee salary: "+salary);
		
	}
public static void main(String[] args) {
	EmployeeDetails emp=new EmployeeDetails();
	emp.name="perumal";
	emp.phoneNo=6385522571l;
	emp.salary=20000.00;
	emp.employee();
	EmployeeDetails emp1=new EmployeeDetails();
	emp1.name="parasu";
	emp1.phoneNo=571548971l;
	emp1.salary=30000.00;
	emp1.employee();
}

}

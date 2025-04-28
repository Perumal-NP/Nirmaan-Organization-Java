package day12;

public class MethoondOverLoadingAndConstructor {

	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public MethoondOverLoadingAndConstructor() {
		System.out.println("Empty Constructor");
	}
	MethoondOverLoadingAndConstructor(int a,int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethoondOverLoadingAndConstructor m1=new MethoondOverLoadingAndConstructor();
		m1.add(10,20);
		MethoondOverLoadingAndConstructor m2=new MethoondOverLoadingAndConstructor(10,20);

	}

}

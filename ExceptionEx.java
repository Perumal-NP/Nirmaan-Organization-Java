package day20;


public class ExceptionEx {

	public static void main(String[] args) {

		try {
			int num=10/0;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello world");
		
}
}

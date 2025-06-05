package day27;



class Thread1{
	
	public void display() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread Class 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}class Thread2 {
public void display() {
	for(int i=0;i<10;i++) {
		System.out.println("Thread Class 2");
	}
	}
}
public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
	Thread1 t1=new Thread1();
	Thread2 t2 =new Thread2();
	Runnable r1=()-> t1.display(); 
		
    Runnable r2=()->t2.display();

	Thread tr1 = new Thread(r1);
	Thread tr2 = new Thread(r2);
	tr1.start();
	tr2.start();

	tr1.join();
	tr2.join();
	System.out.println(tr1.getState());
	System.out.println(tr2.getState());
	
	}

}

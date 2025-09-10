package Thread_Package;

public class Thread_Main {

	public static void main(String[] args) 
	{
		Thread_1 thread1 = new Thread_1();
		Thread_2 thread2 = new Thread_2();
		
		thread1.start();
		thread2.start();
		

	}

}

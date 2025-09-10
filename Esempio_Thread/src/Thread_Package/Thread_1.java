package Thread_Package;

public class Thread_1 extends Thread
{
	public void run()
	{
		for(int i = 0; i<100; i++)
		{
			System.out.println("Questo è il Thread 1");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}

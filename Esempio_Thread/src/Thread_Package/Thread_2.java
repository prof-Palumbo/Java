package Thread_Package;

public class Thread_2 extends Thread
{
	public void run()
	{
		for(int i = 0; i<100; i++)
		{
			System.out.println("Questo è il Thread 2");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}

package communityuni.com.model;

public class MyThread implements Runnable{

	public void run() {
		try
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+",i="+i);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

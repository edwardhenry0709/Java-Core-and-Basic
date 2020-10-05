package communityuni.com;

public class HocContinue {

	public static void func() throws Exception
	{
		try
		{
			//lệnh
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(i%3==0)
				continue;
			System.out.println(i);
		}
		try
		{
			//lệnh
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("finally");
		}

	}

}

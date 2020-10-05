package communityuni.com;

public class TestThrow {

	public static void PtBac1(int a,int b) throws Exception
	{
		try
		{
			System.out.println("x="+(-b/a));
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		try {
			PtBac1(0, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

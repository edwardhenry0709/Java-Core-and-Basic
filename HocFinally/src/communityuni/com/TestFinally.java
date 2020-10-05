package communityuni.com;

public class TestFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int x=5;
			int y=1;
			int z=x/y;
			System.out.println("z="+z);
			System.out.println("Xin cảm ơn!");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("Trời sập ta vẫn chạy!");
		}
	}

}

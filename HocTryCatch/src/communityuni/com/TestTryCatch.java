package communityuni.com;

public class TestTryCatch {

	public static void main(String[] args) {
		try
		{
			int x=5;
			int y=20/10;
			System.out.println("x="+x);
			System.out.println("y="+y);
			int z=x/y;
			System.out.println("z="+z);
			
			double k=999999999;
			double l=Double.MAX_VALUE;
			double p=k*l;
			System.out.println("p="+p);
			
			int d=Integer.parseInt("15.5");
			System.out.println(d);
		}
		catch(Exception ex)
		{
			System.out.println("Có lỗi, chi tiết:");
			ex.printStackTrace();
		}
		System.out.println("Cám ơn thím là dùng phần mềm!");
	}

}

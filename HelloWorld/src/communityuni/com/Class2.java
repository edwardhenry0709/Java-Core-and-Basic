package communityuni.com;

public class Class2 {

	public static void fn1(int x)
	{
		System.out.println(x);
	}
	public void fn2(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		Class2 c=new Class2();
		
		c.fn2(113);
		
		Class2.fn1(113);		
	}
}

package communityuni.com;

public class Class1 {

	private static int value;
	public void setValue(int x)
	{
		value=x;
	}
	public int getValue()
	{
		return value;
	}
	
	
	public static void main(String[] args) {
		Class1 c1=new Class1();
		c1.setValue(9);
		Class1 c2=new Class1();
		System.out.println(c2.getValue());
		c2.setValue(100);
		System.out.println(c1.getValue());
	}

}

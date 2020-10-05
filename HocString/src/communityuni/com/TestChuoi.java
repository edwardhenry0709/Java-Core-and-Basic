package communityuni.com;

public class TestChuoi {

	public static void main(String[] args) {
		String s1=new String();
		String s2=new String("Obama");
		String s3="Obama";
		System.out.println("Chiều dài của s1="+s1.length());
		System.out.println("Chiều dài của s2="+s2.length());
		System.out.println("Chiều dài của s3="+s3.length());
		if(s2==s3)
		{
			System.out.println("s2 bằng s3");
		}
		else
		{
			System.out.println("s2 không bằng s3");
		}
		if(s2.equals(s3))
		{
			System.out.println("giá trị s2 bằng s3");
		}
		else
		{
			System.out.println("giá trị s2 ko bằng s3");
		}
		
	}

}

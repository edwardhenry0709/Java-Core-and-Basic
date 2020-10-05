package communityuni.com;

public class TestSoSanh {

	public static void main(String[] args) {
		String s1="AN";
		String s2="an";
		int kq=s1.compareTo(s2);
		System.out.println(kq);
		
		int kq2=s1.compareToIgnoreCase(s2);
		System.out.println(kq2);
		
		if(s1.equals(s2))
		{
			System.out.println("s1=s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("s1=s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
	}

}

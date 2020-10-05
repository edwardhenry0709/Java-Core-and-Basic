package communityuni.com;

public class HocComment {

	/**
	 * Đây là hàm giải phương trình bậc 1 ax+b=0
	 * @param a - hệ số a
	 * @param b - hệ số b
	 */
	public static void ptb1(double a,double b)
	{
		if(a==0 && b==0)
			System.out.println("PT vô số nghiệm");
		else if(a==0 &&b!=0)
			System.out.println("PT vô nghiệm");
		else
			System.out.println("PT có nghiệm x="+(-b/a));
	}
	public static void main(String[] args) {
		ptb1(7, 2);
	}

	
	
	
	
}

package communityuni.com;

public class TestLoi {

	public static void giaiPTB2(int a,int b,int c)
	{
		double delta=b*b-4*a*c;
		if(delta<0)
			System.out.println("PT Vô Nghiệm");
		else if(delta>0)
			System.out.println("PT Có 2 nghiệm phân biệt");
		else
			System.out.println("PT có nghiệm kép");
	}
	public static void main(String[] args) {
		//giaiPTB2(1, -4, 4);//1x^2+ 3x-4=0
		// TODO Auto-generated method stub
		int x, y, z;
		x=5;
		y=x+3;
		x=3/5;
		System.out.println("x="+x);
		z=8/x;
		System.out.println("z="+z);
	}

}

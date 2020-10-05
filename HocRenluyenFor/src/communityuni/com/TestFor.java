package communityuni.com;

import java.util.Scanner;

public class TestFor {

	public static double TinhS(int n,int x)
	{
		double s=0;
		double mau=0;
		for(int i=1;i<=n;i++)
		{
			double tu=Math.pow(x, i);
			mau=mau+i;
			s=s+tu/mau;
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Thím nhập x:");
		int x=sc.nextInt();
		System.out.println("Thím nhập n:");
		int n=sc.nextInt();
		double s=TinhS(n, x);
		System.out.println("S("+x+","+n+")="+s);
	}

}

package communityuni.com;

import java.util.Scanner;

public class TestDebug {

	public static void Cong(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập a:");
		int a=sc.nextInt();
		System.out.println("Mời bạn nhập b:");
		int b=sc.nextInt();
		if(b==0 || a==0)
		{
			System.out.println("Một trong 2 số = 0");
		}
		else
		{
			Cong(a, b);
			System.out.println("OK OK OK!");
		}
	}

}

package communityuni.com;

import java.util.Scanner;

public class TestPTBac2 {
	/**
	 * Giải phương trình bậc 2: ax^2+bx+c=0
	 * @param a - hệ số a
	 * @param b - hệ số b
	 * @param c - hệ số c
	 */
	public static void giaiPTB2(double a,double b,double c)
	{
		if(a==0)
		{
			System.out.println("PT trở thành bậc 1");
			if(b==0 && c==0)
			{
				System.out.println("PT vô số nghiệm");
			}
			else if(b==0 && c!=0)
			{
				System.out.println("PT Vô nghiệm");
			}
			else
			{
				//bx+c=0=>bx=-c=>x=-c/b
				System.out.println("PT có nghiệm x="+(-c/b));
			}
		}
		else
		{
			double delta=b*b-4*a*c;
			if(delta<0)
			{
				System.out.println("PT Vô nghiệm delta<0");
			}
			else if(delta==0)
			{
				System.out.println("PT có No kép x1=x2="+(-b/(2*a)));
			}
			else
			{
				double x1=(-b-Math.sqrt(delta))/(2*a);
				double x2=(-b+Math.sqrt(delta))/(2*a);
				System.out.println("PT có 2 No phân biệt, x1="+x1+";x2="+x2);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2");
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Mời bạn nhập vào hệ số a:");
			double a=sc.nextDouble();
			System.out.println("Mời bạn nhập vào hệ số b:");
			double b=sc.nextDouble();
			System.out.println("Mời bạn nhập vào hệ số c:");
			double c=sc.nextDouble();
			giaiPTB2(a, b, c);
			System.out.println("Tiếp không thím?(c/k):");
			String line=new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k"))
				break;
		}
		while(true);
		System.out.println("Cám ơn thím đã dùng phần mềm!");
	}

}

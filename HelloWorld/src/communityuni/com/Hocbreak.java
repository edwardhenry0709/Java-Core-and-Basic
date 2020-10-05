package communityuni.com;

import java.util.Scanner;

public class Hocbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i=0;
		int t=0;
		while(i<n)
		{
			t=t+i;
			if(t>=5)
				break;
			i++;
		}
		while(true)
		{
			System.out.println("Nhập a:");
			int a=new Scanner(System.in).nextInt();
			System.out.println("Nhập b:");
			int b=new Scanner(System.in).nextInt();
			System.out.println(a+"+"+b+"="+(a+b));
			System.out.println("Tiếp ko?(c/k)");
			String line=new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k"))
				break;
		}
	}

}

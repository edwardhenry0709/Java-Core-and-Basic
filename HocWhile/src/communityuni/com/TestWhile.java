package communityuni.com;

import java.util.Scanner;

public class TestWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập vào 1 số:");
		int n=sc.nextInt();
		int gt=1;
		int i=1;
		while(i<=n)
		{
			gt=gt*i;
			i++;
		}
		System.out.println(n+"!="+gt);
	}
}

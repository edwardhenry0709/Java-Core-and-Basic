package communityuni.com;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("mời bạn nhập n:");
		int n=sc.nextInt();
		int gt=1;
		int i=1;
		do
		{
			gt=gt*i;
			i++;
		}
		while(i<=n);
		System.out.println(n+"!="+gt);
	}

}

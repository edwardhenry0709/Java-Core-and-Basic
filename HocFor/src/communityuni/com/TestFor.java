package communityuni.com;

import java.util.Scanner;

public class TestFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập vào n:");
		int n=sc.nextInt();
		int gt=1;
		
		for(int i=1;i<=n;i++)
		{
			gt=gt*i;
		}
		System.out.println(n+"!="+gt);
	}

}

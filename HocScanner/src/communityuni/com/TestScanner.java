package communityuni.com;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số:");
		int a=sc.nextInt();
		System.out.println("Bạn vừa nhập : "+a);
		System.out.println("Mời bạn nhập 1 số double:");
		double b=sc.nextDouble();
		System.out.println("Bạn nhập b="+b);
		System.out.println("Mời bạn nhập vào 1 chuỗi:");
		
		String line=new Scanner(System.in).nextLine();
		System.out.println("Bạn nhập chuỗi:"+line);
	}

}

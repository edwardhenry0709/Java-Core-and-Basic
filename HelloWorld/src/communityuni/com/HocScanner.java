package communityuni.com;

import java.util.Scanner;

public class HocScanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập số nguyên:");
		int a=sc.nextInt();
		
		System.out.println("Nhập số double:");
		double d=sc.nextDouble();
		System.out.println("Nhập số float:");
		float f=sc.nextFloat();
		System.out.println("Mời bạn nhập tên:");
		String ten=sc.nextLine();
		
		String s=new Scanner(System.in).nextLine();
		int x=new Scanner(System.in).nextInt();
	}
}

package communityuni.com;

import java.util.Scanner;

public class TestMath {

	public static void main(String[] args) {
		System.out.println("PI="+Math.PI);
		int sonn=Math.min(9,15);
		System.out.println("Số min="+sonn);
		double can=Math.sqrt(25);
		System.out.println("Căn bậc 2 của 25="+can);
		double gttd=Math.abs(-4);
		System.out.println("|-4|="+gttd);
		double lt=Math.pow(3, 4);
		System.out.println("3^4="+lt);
		
		System.out.println("Mời bạn nhập vào 1 Góc:");
		int goc=new Scanner(System.in).nextInt();
		double radian=Math.PI*goc/180;
		double sin=Math.sin(radian);
		double cos=Math.cos(radian);
		double tan=Math.tan(radian);
		double cotan=1/tan;
		System.out.println("Sin("+goc+")="+sin);
		System.out.println("Cos("+goc+")="+cos);
		System.out.println("tan("+goc+")="+tan);
		System.out.println("Cotan("+goc+")="+cotan);
	}

}

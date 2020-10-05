package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1,nv2;
		System.out.println("Mời bạn nhập thông tin của nhân viên 1:");
		System.out.println("Nhập HỌ:");
		String ho1=new Scanner(System.in).nextLine();
		System.out.println("Nhập Tên:");
		String ten1=new Scanner(System.in).nextLine();
		System.out.println("Số Sản phẩm:");
		int soSp1=new Scanner(System.in).nextInt();
		nv1=new NhanVien(ho1, ten1, soSp1);
		
		
		System.out.println("Mời bạn nhập thông tin của nhân viên 2:");
		System.out.println("Nhập HỌ:");
		String ho2=new Scanner(System.in).nextLine();
		System.out.println("Nhập Tên:");
		String ten2=new Scanner(System.in).nextLine();
		System.out.println("Số Sản phẩm:");
		int soSp2=new Scanner(System.in).nextInt();
		nv2=new NhanVien(ho2, ten2, soSp2);
		
		System.out.println("Lương của Nhân viên 1="+nv1.getLuong());
		System.out.println("Lương của Nhân viên 2="+nv2.getLuong());
		
		if(nv1.lonHon(nv2))
		{
			System.out.println
			("Nhân viên["+nv1.getHo()+" "+nv1.getTen()+"] có nhiều số sản phẩm hơn");
			System.out.println("Cụ thể:"+(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		}
		else
		{
			System.out.println
			("Nhân viên["+nv2.getHo()+" "+nv2.getTen()+"] có nhiều số sản phẩm hơn");
			System.out.println("Cụ thể:"+(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
		}
	}

}

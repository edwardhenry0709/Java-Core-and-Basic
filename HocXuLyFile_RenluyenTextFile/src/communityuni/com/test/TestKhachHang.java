package communityuni.com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import communityuni.com.io.TextFileFactory;
import communityuni.com.model.KhachHang;
import communityuni.com.util.DateConverter;

public class TestKhachHang {

	static ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
	public static void menu()
	{
		System.out.println("1.Nhập");
		System.out.println("2.Xuất");
		System.out.println("3.Lưu");
		System.out.println("4.Mở");
		System.out.println("5.Thoát");
		System.out.println("Thím muốn gì?:");
		int n=new Scanner(System.in).nextInt();
		switch(n)
		{
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			luu();
			break;
		case 4:
			mo();
			break;
		case 5:
			System.err.println("Tạm Biệt");
			System.exit(0);
			break;
		}
	}
	private static void mo() {
		dsKH= TextFileFactory.readFile("e://dulieukh.txt");
	}
	private static void luu() {
		if(TextFileFactory.saveFile(dsKH, "e://dulieukh.txt")==true)
			System.out.println("Lưu OK");
	}
	private static void xuat() {
		for(KhachHang kh: dsKH)
		{
			System.out.println(kh);
		}
	}
	private static void nhap() {
		System.out.println("Mời bạn nhập mã:");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Mời bạn nhập tên:");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("Mời bạ nhập năm sinh(dd/MM/yyyy):");
		Date ns=DateConverter.fromString(new Scanner(System.in).nextLine());
		
		KhachHang kh=new KhachHang(ma, ten, ns);
		dsKH.add(kh);
	}
	public static void main(String[] args) {
		while(true)
		{
			menu();
		}
	}

}

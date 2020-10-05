package communityuni.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayList {
	static ArrayList<Integer> dsData=new ArrayList<Integer>();
	public static void menu()
	{
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm Kiếm");
		System.out.println("6.Sắp xếp");
		System.out.println("7.Thoát");
		System.out.println("Thím chọn gì?:");
		int chon=new Scanner(System.in).nextInt();
		switch(chon)
		{
		case 1:
			them();
			break;
		case 2:
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			tim();
			break;
		case 6:
			sapxep();
			break;
		case 7:
			System.err.println("Cám ơn thím!");
			System.exit(0);
			break;
		}
	}
	private static void sapxep() {
		Collections.sort(dsData);
	}
	private static void tim() {
		System.out.println("Thím muốn tìm số nào?:");
		int k=new Scanner(System.in).nextInt();
		if(dsData.contains(k))
		{
			System.out.println("Có "+k +" trong danh sách");
		}
		else
		{
			System.out.println("Ko có "+k +" trong danh sách");
		}
	}
	private static void xoa() {
		System.out.println("Thím muốn xóa vị trí nào?:");
		int vt=new Scanner(System.in).nextInt();
		dsData.remove(vt);
	}
	private static void sua() {
		System.out.println("vị trí muốn sửa:");
		int vt=new Scanner(System.in).nextInt();
		System.out.println("Giá trị mới:");
		int value=new Scanner(System.in).nextInt();
		dsData.set(vt, value);
	}
	private static void xuat() {
		for(int i=0;i<dsData.size();i++)
		{
			System.out.print(dsData.get(i)+"\t");
		}
		System.out.println();
	}
	private static void them() {
		System.out.println("Nhập giá trị muốn thêm:");
		int value=new Scanner(System.in).nextInt();
		dsData.add(value);
	}
	public static void main(String[] args) {
		while(true)
		{
			menu();
		}
	}

}

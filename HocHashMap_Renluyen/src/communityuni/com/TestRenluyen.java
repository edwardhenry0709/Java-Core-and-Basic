package communityuni.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestRenluyen {
	static HashMap<Integer,String>map=new HashMap<Integer, String>();
	public static void menu()
	{
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm");
		System.out.println("6.Thoát");
		System.out.println("Chọn gì đi thím:");
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
			System.err.println("Cám ơn thím!");
			System.exit(0);
			break;
		}
	}
	private static void tim() {
		System.out.println("Nhập tên sách muốn tìm:");
		String ten=new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String> item: map.entrySet())
		{
			if(item.getValue().contains(ten))
			{
				System.out.println(item.getKey()+"-"+item.getValue());
			}
		}
	}
	private static void xoa() {
		System.out.println("Mời bạn nhập mã muốn xóa:");
		int ma=new  Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false)
		{
			System.out.println("Chả thấy mã "+ma +" nào mà xóa");
		}
		else
		{
			map.remove(ma);
		}
	}
	private static void sua() {
		System.out.println("Mời bạn nhập mã muốn sửa:");
		int ma=new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false)
		{
			System.out.println("Mã "+ma+" ko tồn tại");
		}
		else
		{
			System.out.println("Nhập tên sách mới:");
			String ten=new Scanner(System.in).nextLine();
			map.put(ma, ten);
		}
	}
	private static void xuat() {
		System.out.println("Mã\tTên Sách");
		for(Map.Entry<Integer, String > item : map.entrySet())
		{
			System.out.println(item.getKey()+"\t"+item.getValue());
		}
	}
	private static void them() {
		System.out.println("Nhập mã sách:");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Nhập tên sách:");
		String ten=new Scanner(System.in).nextLine();
		if(map.containsKey(ma)==false)
		{
			map.put(ma, ten);
		}
	}
	public static void main(String[] args) {
		while(true)
		{
			menu();
		}
	}

}

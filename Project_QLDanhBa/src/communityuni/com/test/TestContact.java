package communityuni.com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.Contact;

public class TestContact {
	static HashMap<Integer, Contact>csdl=new HashMap<Integer, Contact>();
	public static void menu()
	{
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm");
		System.out.println("6.Sắp xếp");
		System.out.println("7.Lưu File");
		System.out.println("8.Đọc File");
		System.out.println("9.Thoát");
		System.out.println("Thím mốn gì?:");
		int n=new Scanner(System.in).nextInt();
		switch(n)
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
			luuFile();
			break;
		case 8:
			docFile();
			break;
		case 9:
			System.err.println("Tạm biệt!");
			System.exit(0);
			break;
		}
	}
	private static void docFile() {
		csdl=SerializeFileFactory.readFile("e://csdlcontact.dat");
	}
	private static void luuFile() {
		SerializeFileFactory.saveFile(csdl, "e://csdlcontact.dat");
	}
	private static void sapxep() {
		System.out.println("Tự làm nha.. ha ha ha");
		//sắp theo mã
		//sắp theo tên
		//sắp theo số điện thoại
	}
	private static void tim() {
		System.out.println("Nhập phone:");
		String phone=new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, Contact> item: csdl.entrySet())
		{
			if(item.getValue().getPhone().startsWith(phone))
				System.out.println(item.getValue());
		}
	}
	private static void xoa() {
		System.out.println("Nhập mã:");
		int ma=new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma))
		{
			csdl.remove(ma);
		}
		else
		{
			System.out.println("Không tìm thấy mã "+ma+" để xóa");
		}
	}
	private static void sua() {
		System.out.println("Nhập mã muốn sửa:");
		int ma=new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma))
		{
			System.out.println("Nhập Tên:");
			String ten=new Scanner(System.in).nextLine();
			System.out.println("Nhập Phone:");
			String phone=new Scanner(System.in).nextLine();
			
			Contact c=new Contact(ma, ten, phone);
			csdl.put(ma, c);
		}
		else
		{
			System.out.println("mã "+ma+" không tồn tại");
		}
	}
	private static void xuat() {
		System.out.println("Danh sách Danh Bạ:");
		for(Map.Entry<Integer, Contact> item: csdl.entrySet())
		{
			System.out.println(item.getValue());
		}
	}
	private static void them() {
		System.out.println("Nhập Mã:");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Nhập Tên:");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("Nhập Phone:");
		String phone=new Scanner(System.in).nextLine();
		
		Contact c=new Contact(ma, ten, phone);
		if(csdl.containsKey(c.getId())==false)
		{
			csdl.put(c.getId(), c);
		}
	}
	public static void main(String[] args) {
		while(true)
		{
			menu();
		}
	}

}

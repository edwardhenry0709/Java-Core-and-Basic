package communityuni.com;

import java.util.Random;
import java.util.Scanner;

public class TestLuyenTap {
	static int []M;
	public static void menu()
	{
		System.out.println("1.Nhập Mảng");
		System.out.println("2.Xuất Mảng");
		System.out.println("3.Tổng Mảng");
		System.out.println("4.Tìm kiếm");
		System.out.println("5.Lớn nhất");
		System.out.println("6.Nhỏ nhất");
		System.out.println("7.Số nguyên tố");
		System.out.println("8.Sắp tăng");
		System.out.println("9.Sắp giảm");
		System.out.println("-1.Thoát");
		System.out.println("Thím muốn gì?:");
		int chon=new Scanner(System.in).nextInt();
		switch(chon)
		{
		case 1:
			nhapMang();
			break;
		case 2:
			xuatMang();
			break;
		case 3:
			tinhTong();
			break;
		case 4:
			timKiem();
			break;
		case 5:
			timMax();
			break;
		case 6:
			timMin();
			break;
		case 7:
			soNguyenTo();
			break;
		case 8:
			sapTangDan();
			break;
		case 9:
			sapGiamDan();
			break;
		case -1:
			System.err.println("Cám ơn bạn đã dùng phần mềm");
			System.exit(0);
		default:
			System.out.println("Thím nhập lụi rồi!");
				break;
		}
	}
	private static void sapGiamDan() {
		for(int i=0;i<M.length;i++)
		{
			for(int j=i+1;j<M.length;j++)
			{
				if(M[i]<M[j])
				{
					int tam=M[i];
					M[i]=M[j];
					M[j]=tam;
				}
			}
		}		
	}
	private static void sapTangDan() {
		for(int i=0;i<M.length;i++)
		{
			for(int j=i+1;j<M.length;j++)
			{
				if(M[i]>M[j])
				{
					int tam=M[i];
					M[i]=M[j];
					M[j]=tam;
				}
			}
		}
	}
	private static void soNguyenTo() {
		System.out.println("Các số nguyên tố:");
		for(int i=0;i<M.length;i++)
		{
			int dem=0;
			for(int j=1;j<=M[i];j++)
			{
				if(M[i]%j==0)
					dem++;
			}
			if(dem==2)
				System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	private static void timMin() {
		int min=M[0];
		for(int i=1;i<M.length;i++)
		{
			if(M[i]<min)
				min=M[i];
		}
		System.out.println("Số nhỏ nhất = "+min);		
	}
	private static void timMax() {
		int max=M[0];
		for(int i=1;i<M.length;i++)
		{
			if(M[i]>max)
				max=M[i];
		}
		System.out.println("Số lớn nhất = "+max);
	}
	private static void timKiem() {
		int soLan=0;
		String s="";
		System.out.println("Thím muốn tìm số gì?:");
		int k=new Scanner(System.in).nextInt();
		for(int i=0;i<M.length;i++)
		{
			if(M[i]==k)
			{
				soLan++;
				s+=i+";";
			}
		}
		if(soLan==0)
		{
			System.out.println("Không thấy "+k+" trong mảng");
		}
		else
		{
			System.out.println("Thấy "+k+" trong mảng");
			System.out.println("Các vị trí tìm thấy:");
			System.out.println(s);
		}
	}
	private static void tinhTong() {
		int sum=0;
		for(int x: M)
			sum+=x;
		System.out.println("Tổng mảng ="+sum);
	}
	private static void xuatMang() {
		System.out.println("Các phần tử trong mảng là:");
		for(int i=0;i<M.length;i++)
			System.out.print(M[i]+"\t");
		System.out.println();
	}
	private static void nhapMang() {
		System.out.println("Mời bạn nhập số phần tử:");
		int n=new Scanner(System.in).nextInt();
		M=new int[n];
		Random rd=new Random();
		for(int i=0;i<n;i++)
		{
			M[i]=rd.nextInt(100);
		}
	}
	public static void main(String[] args) {
		while(true)
		{
			menu();			
		}
	}

}

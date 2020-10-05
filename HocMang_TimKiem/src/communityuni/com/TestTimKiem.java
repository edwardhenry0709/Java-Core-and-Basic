package communityuni.com;

import java.util.Scanner;

public class TestTimKiem {

	public static void NhapMang(int M[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<M.length;i++)
		{
			System.out.print("M["+i+"]=");
			M[i]=sc.nextInt();
		}
	}
	public static void XuatMang(int M[])
	{
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	public static void TimPhanTu(int M[],int k)
	{
		boolean timThay=false;
		for(int i=0;i<M.length;i++)
		{
			if(M[i]==k)
			{
				timThay=true;
				break;
			}
		}
		if(timThay==true)
		{
			System.out.println("Có tìm thấy "+k+" trong mảng");
		}
		else
		{
			System.out.println("Ko tìm thấy "+k+" trong mảng");
		}
	}
	public static void timSoLanXuatHienPhanTu(int M[],int k)
	{
		String s="";
		int solan=0;
		for(int i=0;i<M.length;i++)
		{
			if(M[i]==k)
			{
				s+=i+";";
				solan++;
			}
		}
		if(s.length()>0)
		{
			System.out.println("Tìm thấy "+k+" xuất hiện "+solan+" lần");
			System.out.println("Các vị trí này là:");
			System.out.println(s);
		}
		else
		{
			System.out.println("Không tìm thấy "+k);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập số phần tử của mảng:");
		int n=sc.nextInt();
		int []M=new int[n];
		System.out.println("Mời bạn nhập giá trị cho mảng:");
		NhapMang(M);
		System.out.println("Mảng sau khi nhập là:");
		XuatMang(M);
		System.out.println("Mời bạn nhập vào số muốn tìm:");
		int k=sc.nextInt();
		TimPhanTu(M, k);
		
		System.out.println("Mời bạn nhập số khác để tìm:");
		int x=sc.nextInt();
		timSoLanXuatHienPhanTu(M, x);
	}

}

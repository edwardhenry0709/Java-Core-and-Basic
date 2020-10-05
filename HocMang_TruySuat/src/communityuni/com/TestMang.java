package communityuni.com;

import java.util.Scanner;

public class TestMang {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []M;
		System.out.println("Mời bạn nhập số phần tử tối đa:");
		int n=sc.nextInt();
		//cấp phát n phần tử cho mảng M
		M=new int[n];
		//tiến hành nhập liệu cho từng phần tử trong mảng:
		System.out.println("Mời bạn nhập giá trị cho Mảng:");
		for(int i=0;i<M.length;i++)
		{
			System.out.print("M["+i+"]=");
			M[i]=sc.nextInt();
		}
		System.out.println("Mảng sau khi bạn nhập là:");
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
		System.out.println();
		System.out.println("Xuất mảng theo giá trị:");
		for(int i: M)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		M[2]=113;
		System.out.println("Mảng sau khi bạn nhập là:");
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
	}

}

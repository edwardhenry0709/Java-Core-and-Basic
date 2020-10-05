package communityuni.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestSapXep {

	public static void nhapMang(int M[])
	{
		Random rd=new Random();
		
		for(int i=0;i<M.length;i++)
		{
			M[i]=rd.nextInt(100);
		}
	}
	public static void xuatMang(int M[])
	{
		for(int i=0;i<M.length;i++)
		{
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	public static void BubbleSort(int []M)
	{
	   int i, j;
	   for (i = 0; i < M.length - 1; i++)
	   { 
	     for (j = M.length - 1; j > i; j--)
	      {
	          if (M[j] < M[j - 1])// nếu có nghịch thế
	          {
	             int temp = M[j];
	             M[j] = M[j - 1];
	             M[j - 1] = temp;
	           }
	       }
	   }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập số phần tử:");
		int n=sc.nextInt();
		int M[]=new int[n];
		
		nhapMang(M);
		System.out.println("Mảng sau khi nhập ngẫu nhiên:");
		xuatMang(M);
		//BubbleSort(M);
		Arrays.sort(M);
		System.out.println("Mảng sau khi sắp xếp:");
		xuatMang(M);
	}

}

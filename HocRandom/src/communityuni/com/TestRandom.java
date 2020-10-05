package communityuni.com;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {

	public static void choi()
	{
		Random rd=new Random();
		int soMay=rd.nextInt(101);
		System.out.println("Máy đã ra 1 số [0...100] mời Thím đoán!");
		int soNguoi;
		int soLanDoan=0;
		do
		{
			System.out.println("Bạn đoán số gì?:");
			soNguoi=new Scanner(System.in).nextInt();
			soLanDoan++;
			System.out.println("Thím đoán lần thứ "+soLanDoan);
			if(soNguoi==soMay)
			{
				System.out.println("Chúc mừng Thím! Thím đoán đúng, số máy ="+soMay);				
				break;
			}
			if(soNguoi<soMay)
			{
				System.out.println("Thím đoán sai! số máy > số thím");
			}
			else
			{
				System.out.println("Thím đoán sai! số máy <số thím");
			}
			if(soLanDoan==7)
			{
				System.out.println("Thím đã Cáo Phó, vì đoán 7 lần mà ko trúng!");
				break;
			}
		}
		while(soLanDoan<=7);
	}
	
	public static void main(String[] args) {
		while(true)
		{
			choi();
			System.out.println("Chơi nữa không thím?(c/k):");
			String tl=new Scanner(System.in).nextLine();
			if(tl.equalsIgnoreCase("k"))
				break;
		}
		System.out.println("Tạm biệt Thím!");
	}

}

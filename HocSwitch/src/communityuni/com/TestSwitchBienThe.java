package communityuni.com;

import java.util.Scanner;

public class TestSwitchBienThe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập 1 tháng:");
		int t=sc.nextInt();
		switch(t)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng "+t +" có 31 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng "+t +" có 30 ngày");
			break;
		case 2:
			System.out.println("Mời bạn nhập 1 năm:");
			int y=sc.nextInt();
			if((y%4==0 && y%100!=0) || y%400==0)
			{
				System.out.println("Năm "+y+" nhuần==>Tháng "+t+" có 29");
			}
			else
			{
				System.out.println("Năm "+y+" ko nhuần==>Tháng "+t+" có 28");
			}
			break;
		default:
			System.err.println("Bạn nhập tháng lụi rồi thím ới");
			break;
		}
	}

}

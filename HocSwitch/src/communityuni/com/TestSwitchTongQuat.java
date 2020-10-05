package communityuni.com;

import java.util.Scanner;

public class TestSwitchTongQuat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập vào 1 tháng:");
		int t=sc.nextInt();
		switch(t)
		{
		case 1:
			System.out.println("Tháng "+t +" có 31 ngày");
			break;
		case 3:
			System.out.println("Tháng "+t +" có 31 ngày");
			break;
		case 5:
			System.out.println("Tháng "+t +" có 31 ngày");
			break;
		case 7:
			System.out.println("Tháng "+t +" có 31 ngày");
			break;
		case 8:
			System.out.println("Tháng "+t +" có 31 ngày");
			break;
		case 10:
			System.out.println("Tháng "+t +" có 31 ngày");
			break;
		case 12:
			System.out.println("Tháng "+t +" có 31 ngày");
			break;
		case 4:
			System.out.println("Tháng "+t +" có 30 ngày");
			break;
		case 6:
			System.out.println("Tháng "+t +" có 30 ngày");
			break;
		case 9:
			System.out.println("Tháng "+t +" có 30 ngày");
			break;
		case 11:
			System.out.println("Tháng "+t +" có 30 ngày");
			break;
		case 2:
			System.out.println("Tháng "+t +" có 29 hoặc 28");
			break;
		default:
			System.err.println("Bạn nhập sai tháng");
			break;
		}
	}

}

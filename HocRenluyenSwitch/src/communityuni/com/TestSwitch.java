package communityuni.com;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Mời bạn nhập số a:");
			int a=sc.nextInt();
			System.out.println("Mời bạn nhập số b:");
			int b=sc.nextInt();
			System.out.println("Mời bạn nhập phép toán:");
			char ch=new Scanner(System.in).nextLine().charAt(0);
			switch(ch)
			{
			case '+':
				System.out.println(a+"+"+b+"="+(a+b));
				break;
			case '-':
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case '*':
				System.out.println(a+"*"+b+"="+(a+b));
				break;
			case '/':
				if(b==0)
					System.out.println("Mẫu =0");
				else
					System.out.println(a+"/"+b+"="+(a*1.0/b));
				break;
			default:
				System.out.println("hình như thím nhập lụi phép toán!");
				break;
			}
			System.out.println("Nữa không thím?(c/k):");
			String line=new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k"))
				break;
		}
		System.out.println("Cám ơn thím! G9 thím!");
	}

}

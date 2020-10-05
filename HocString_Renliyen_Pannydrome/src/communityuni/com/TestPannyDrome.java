package communityuni.com;

import java.util.Scanner;

public class TestPannyDrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập vào 1 chuỗi:");
		String s=sc.nextLine();
		char []arr=s.toCharArray();
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[arr.length-1-i])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(s +" -> phải là panlyndrome");
		}
		else
		{
			System.out.println(s+" -> ko phải là panlyndrome");
		}
	}

}

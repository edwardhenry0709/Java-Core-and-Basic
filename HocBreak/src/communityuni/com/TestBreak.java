package communityuni.com;

import java.util.Scanner;

public class TestBreak {

	public static void main(String[] args) {
		while(true)
		{
			System.out.println("Mời bạn nhập vào 1 số:");
			int n=new Scanner(System.in).nextInt();
			if(n%2==0)
				System.out.println(n+" là số chẵn");
			else
				System.out.println(n+" là số lẻ");
			
			System.out.println("Tiếp ko?(c/k):");
			String line=new Scanner(System.in).nextLine();
			
			if(line.equalsIgnoreCase("k"))
				break;
		}
		System.out.println("Bye bye!");
	}

}

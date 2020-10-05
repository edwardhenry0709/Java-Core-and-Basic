package communityuni.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập vào điểm toán:");
		double toan=sc.nextDouble();
		System.out.println("Mời bạn nhập vào điểm lý:");
		double ly=sc.nextDouble();
		System.out.println("Mời bạn nhập vào điểm hóa:");
		double hoa=sc.nextDouble();
		double dtb=(toan+ly+hoa)/3;
		System.out.println("ĐTB="+dtb);
		
		DecimalFormat dcf=new DecimalFormat("#.##");
		System.out.println("ĐTB="+dcf.format(dtb));
	}

}

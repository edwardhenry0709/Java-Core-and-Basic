package communityuni.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestNhapNgayThangNam {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int yearNow=cal.get(Calendar.YEAR);
		
		System.out.println("Mời thím nhập năm sinh(dd/MM/yyyy):");
		String ns=new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthday=sdf.parse(ns);
			//đổi ngày tháng năm:
			cal.setTime(birthday);
			int yearNs=cal.get(Calendar.YEAR);
			
			int tuoi=yearNow-yearNs;
			System.out.println("Bạn "+tuoi+" tuổi");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

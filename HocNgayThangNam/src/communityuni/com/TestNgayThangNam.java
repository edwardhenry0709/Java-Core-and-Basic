package communityuni.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestNgayThangNam {

	public static void main(String[] args) {
		//Lấy ngày giờ hiện tại của hệ thống:
		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		int month=cal.get(Calendar.MONTH);
		System.out.println(month+1);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		Date t=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(t));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf2.format(t));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf3.format(t));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
		System.out.println(sdf4.format(t));
	}

}

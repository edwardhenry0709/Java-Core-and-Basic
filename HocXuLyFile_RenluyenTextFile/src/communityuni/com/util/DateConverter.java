package communityuni.com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
	public static Date fromString(String d)
	{
		try
		{
			Date date=sdf.parse(d);
			return date;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	public static String fromDate(Date d)
	{
		return sdf.format(d);
	}
}

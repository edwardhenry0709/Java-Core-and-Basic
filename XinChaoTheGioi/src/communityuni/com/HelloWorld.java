package communityuni.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class HelloWorld {

public static void main(String[] args) {
	System.out.println("Obama xin chào các bạn!");
	
	DecimalFormat dcf=new DecimalFormat("#,###");
	DecimalFormatSymbols dfs=
			new DecimalFormatSymbols(Locale.getDefault());
	dfs.setGroupingSeparator(',');
	double x=1243532523.3;
	dcf.setDecimalFormatSymbols(dfs);
	System.out.println(dcf.format(x));
}

}

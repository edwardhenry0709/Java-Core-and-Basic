package communityuni.com;

import java.util.StringTokenizer;

public class TestTimKiem {

	public static void main(String[] args) {
		String s="Công tằng anh nữ, nguyễn thị anh long lanh chòng chành anh tuyết";
		int vt1=s.indexOf("ô");
		System.out.println("Tìm thấy [ô] ở vị trí "+vt1);
		int vt2=s.indexOf("anh");
		System.out.println("Tìm thấy [anh] ở vị trí "+vt2);
		int vt3=s.indexOf("hùng");
		if(vt3==-1)
			System.out.println("Ko tìm thấy hùng");
		else
			System.out.println("tìm thấy hùng");
		int vt4=s.lastIndexOf("ô");
		System.out.println("Tìm thấy [ô] ở vị trí "+vt4);
		int vt5=s.lastIndexOf("anh");
		System.out.println("Tìm thấy [anh] ở vị trí "+vt5);
		
		if(s.contains("nữ")==true)
			System.out.println("Có chữ Nữ trong chuỗi");
		else
			System.out.println("Ko Có chữ Nữ trong chuỗi");
		
		StringTokenizer token=new StringTokenizer(s);
		int dem=0;
		while(token.hasMoreTokens())
		{
			String value=token.nextToken();
			if(value.contains("anh"))
			{
				dem++;
			}
		}
		System.out.println("Tìm thấy "+dem+" lần từ [anh]");
	}

}

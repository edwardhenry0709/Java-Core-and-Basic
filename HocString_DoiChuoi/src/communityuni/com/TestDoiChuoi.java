package communityuni.com;

public class TestDoiChuoi {

	public static void main(String[] args) {
		String s="Xin chào Obama! Tui là Putin";
		s.replace("Obama", "Kim Jong Un");
		System.out.println(s);
		s=s.replace("Obama", "Kim Jong Un");
		System.out.println(s);
		
		s="Obama Xin chào Michelle Obama";
		s=s.replaceFirst("Obama", "Putin");
		System.out.println(s);
		
		s="Obama Xin chào Michelle Obama";
		s=s.replace("Obama", "Putin");
		System.out.println(s);

	}

}

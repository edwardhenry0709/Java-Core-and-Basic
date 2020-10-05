package communityuni.com;

public class TestInHoaInThuong {

	public static void main(String[] args) {
		String s1="obama";
		s1=s1.toUpperCase();
		System.out.println(s1);
		
		s1="obama";
		s1=s1.replaceFirst("o", "o".toUpperCase());
		System.out.println(s1);
		
		s1="chu Bá Thông";
		s1=s1.replaceFirst(
				(s1.charAt(0)+""), 
				(s1.charAt(0)+"").toUpperCase());
		System.out.println(s1);
		
		String s2="PUTIN";
		s2=s2.toLowerCase();
		s2=s2.replaceFirst(
				(s2.charAt(0)+""), 
				(s2.charAt(0)+"").toUpperCase());
		System.out.println(s2);
	}

}

package communityuni.com;

public class TestXoaKhoangTrang {

	public static void main(String[] args) {
		String s="   Trần Duy Thanh   ";
		System.out.println(s);
		System.out.println("=>Chiều dài = "+s.length());
		s=s.trim();
		System.out.println(s);
		System.out.println("=>Chiều dài = "+s.length());
		
		s="  Obama ăn cơm trưa với Putin  ";
		int vtLeft=0;
		int i=0;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
				vtLeft=i;
			else
				break;
		}
		s=s.substring(i);
		System.out.println(s);
		s="  Obama ăn cơm trưa với Putin  ";
		int vtRight=0;
		i=0;
		for(i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(c==' ')
				vtRight=i;
			else
				break;
		}
		s=s.substring(0, vtRight);
		System.out.println(s);
	}

}

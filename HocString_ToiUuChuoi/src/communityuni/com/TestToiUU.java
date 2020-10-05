package communityuni.com;

public class TestToiUU {

	public static String toiUU(String s)
	{
		String sToiTuu=s;
		sToiTuu=sToiTuu.trim();
		String []arrWord=sToiTuu.split(" ");
		sToiTuu="";
		for(String word : arrWord)
		{
			String newWord=word.toLowerCase();
			if(newWord.length()>0)
			{
				newWord=newWord.replaceFirst(
						newWord.charAt(0)+"",
						(newWord.charAt(0)+"").toUpperCase());
				sToiTuu+=newWord+" ";
			}
		}
		return sToiTuu.trim();
	}
	public static void main(String[] args) {
		String s="   TRẦN         dUY     THanh   ";
		System.out.println(s);
		String sToiUuu=toiUU(s);
		System.out.println(sToiUuu);
		
		s="     NguyễN      VĂN  OBAMA   ";
		System.out.println(s);
		sToiUuu=toiUU(s);
		System.out.println(sToiUuu);
	}

}

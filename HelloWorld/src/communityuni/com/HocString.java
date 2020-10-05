package communityuni.com;

public class HocString {

	public static void main(String[] args) {
		String s="Obama;Putin;Kim Jong Un";
		String []arr=s.split(";");
		for(String name: arr)
			System.out.println(name);
		int []M;
		
		/*String s="PUTIN".toLowerCase();
		System.out.println(s);*/
		/*StringBuilder builder=new StringBuilder("Obama Putin");
		builder.insert(6, "Kim Jong Un ");
		System.out.println(builder.toString());*/
		
		
		/*String s="Obama";
		s=s+" Putin";
		System.out.println(s);
		StringBuilder builder=new StringBuilder();
		builder.append("Obama");
		builder.append("\t");
		builder.append("Putin");
		builder.append("\t");
		builder.append("Kim Jong Un");
		System.out.println(builder.toString());*/
		/*
		String s1="Hạnh phúc";
		String s2="Hạnh PHÚC";
		int x=s1.compareToIgnoreCase(s2);
		System.out.println(x);
		
		// TODO Auto-generated method stub
		String s="Obama Xin chào Michelle Obama";
		s= s.replaceFirst("Obama", "Putin");
		System.out.println(s);
		*/
/*		String s2=s.substring(9);
		System.out.println(s2);
		String s3=s.substring(9, 14);
		System.out.println(s3);
*/		
	}

}

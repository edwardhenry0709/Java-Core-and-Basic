package communityuni.com;

public class TestNoiChuoi {

	public static void main(String[] args) {
		String s1="Hạnh Phúc";
		String s2="Vô thường";
		String s3=s1+" "+s2;
		System.out.println(s3);
		
		String s4="Obama"+1;
		System.out.println(s4);
		String s5="Obama"+1+2;
		System.out.println(s5);
		String s6="Obama"+(1+2);
		System.out.println(s6);
		
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.append(" ");
		sb.append(s2);
		System.out.println(sb.toString());
	}

}

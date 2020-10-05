package communityuni.com;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Obama");
		sb.append(" ");
		sb.append("Putin");
		sb.insert(5, "xxx");
		String s=sb.toString();
		System.out.println(s);
		sb.delete(5, 8);
		s=sb.toString();
		System.out.println(s);
		
		System.out.println("s="+s);
	}

}

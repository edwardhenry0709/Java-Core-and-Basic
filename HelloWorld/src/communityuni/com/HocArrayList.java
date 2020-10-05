package communityuni.com;

import java.util.ArrayList;

public class HocArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>ds=new ArrayList<String>();
		ds.add("Hạnh");
		ds.add("Phúc");
		ds.add("Giải");
		ds.add("Thoát");
		ds.add("Vô");
		ds.add("Thường");
		for(String s : ds)
		{
			System.out.println(s);
		}
		for(int i=0;i<ds.size();i++)
		{
			String s=ds.get(i);
		}
	}

}

package communityuni.com;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList ds1=new ArrayList();
		ds1.add("1");
		ds1.add(new Date("12/12/1990"));
		ds1.add("5.5");
		ArrayList<Integer>ds2=new ArrayList<Integer>();
		ArrayList<Double>ds3=new ArrayList<Double>();
		ArrayList<Boolean>ds4=new ArrayList<Boolean>();
		
		ArrayList<String>ds5=new ArrayList<String>();
		ds5.add("Obama");
		ds5.add("Putin");
		ds5.add("Kim Jong Un");
		ds5.add("Binladen");
		
		for(int i=0;i<ds5.size();i++)
			System.out.println(ds5.get(i));
		ds5.add(2, "Bush");
		System.out.println("Danh sách sau khi chèn:");
		for(int i=0;i<ds5.size();i++)
			System.out.println(ds5.get(i));
		ds5.remove(3);
		System.out.println("Danh sách sau khi xóa:");
		for(int i=0;i<ds5.size();i++)
			System.out.println(ds5.get(i));
		ds5.set(3, "Hồ Cẩm Đào");
		System.out.println("Danh sách sau khi Sửa:");
		for(int i=0;i<ds5.size();i++)
			System.out.println(ds5.get(i));
		ds5.clear();
		System.out.println("Số phần tử còn lại trong ds5="+ds5.size());
	}

}

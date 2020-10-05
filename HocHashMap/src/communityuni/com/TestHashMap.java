package communityuni.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(1, "An");
		map.put(2, "Bình");
		map.put(3, "Hạnh");
		map.put(4, "Phúc");
		map.put(5, "Giải");
		map.put(6, "Thoát");
		//Lấy toàn bộ tên ra:
		Collection<String> dsTen=map.values();
		for(String ten: dsTen)
		{
			System.out.println(ten);
		}
		System.out.println("Danh sách mã:");
		Set<Integer>dsMa= map.keySet();
		for(int ma: dsMa)
		{
			System.out.println(ma);
		}
		
		for(Map.Entry<Integer, String> en : map.entrySet())
		{
			System.out.println(en.getKey()+"-"+en.getValue());
		}
		
		String ten=map.get(4);
		System.out.println(ten);
		
		if(map.containsKey(5)==false)
			map.put(5, "Happy");
		
		System.out.println("-----------------");
		dsTen=map.values();
		for(String ten1: dsTen)
		{
			System.out.println(ten1);
		}
		map.remove(2);
		System.out.println("-------Sau khi xóa----------");
		dsTen=map.values();
		for(String ten1: dsTen)
		{
			System.out.println(ten1);
		}
		map.clear();//xóa trụi lủi danh sách
		System.out.println("Số phần tử còn lại: "+map.size());
	}

}

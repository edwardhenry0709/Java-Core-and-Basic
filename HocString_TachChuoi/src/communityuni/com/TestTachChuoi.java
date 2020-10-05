package communityuni.com;

public class TestTachChuoi {

	public static void main(String[] args) {
		String s="SV001.Nguyễn Thị Thẹo.DHTH113";
		String []arr=s.split("\\.");
		if(arr.length==3)
		{
			System.out.println("Mã="+arr[0]);
			System.out.println("Tên="+arr[1]);
			System.out.println("Lớp="+arr[2]);
		}
		System.out.println("-------------------");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("--------------------");
		for(String x : arr)
			System.out.println(x);
	}

}
